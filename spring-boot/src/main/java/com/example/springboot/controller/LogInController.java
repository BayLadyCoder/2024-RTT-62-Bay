package com.example.springboot.controller;


import com.example.springboot.database.dao.UserDAO;
import com.example.springboot.database.entity.User;
import com.example.springboot.form.CreateAccountFormBean;
import com.example.springboot.security.AuthenticatedUserUtilities;
import com.example.springboot.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import jakarta.validation.Valid;


@Slf4j
@Controller
@RequestMapping("/account")
public class LogInController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticatedUserUtilities authenticatedUserUtilities;


    @GetMapping("create-account")
    public ModelAndView createAccount() {
        ModelAndView response = new ModelAndView("auth/create-account");

        return response;
    }

    @PostMapping("create-account")
    public ModelAndView createAccountSubmit(@Valid CreateAccountFormBean form, BindingResult bindingResult, HttpSession session) {

        ModelAndView response = new ModelAndView("auth/create-account");
        log.info("submit form: " + form.toString());

//        User u = userDAO.findByEmailIgnoreCase(form.getEmail());
//
//        if (u != null) {
//            bindingResult.rejectValue("email", "email", "This email is already in use, (Manual check)");
//        }

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }

            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);

            return response;
        }

        User user = userService.createUser(form);
        userService.createUserRole(user.getId(), "USER");

        // Authenticate the user after creating account
        authenticatedUserUtilities.manualAuthentication(session, form.getEmail(), form.getPassword());

        // redirect to home page
        response.setViewName("redirect:/");
        return response;

    }

    @GetMapping("loginPageUrl")
    public ModelAndView getLogin() {
        ModelAndView response = new ModelAndView("auth/login");

        return response;
    }

}
