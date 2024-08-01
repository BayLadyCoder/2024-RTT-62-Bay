package com.example.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@Slf4j
@Controller
@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(NoResourceFoundException.class)
//    @ExceptionHandler(Exception.class)
    @RequestMapping(value = {"/error/404", "/404"})
    public ModelAndView error404(Exception ex, HttpServletRequest request) {
        ModelAndView response = new ModelAndView("error/404page");

        log.debug("!!!!!!!!!!!!!!!!!! IN ERROR CONTROLLER : 404 NOT FOUND : " + request.getMethod() + " " + request.getRequestURI());
        log.error("ERROR MESSAGE!! " + ex.getMessage());
//        ex.printStackTrace();
        // this line of code is specifically setting a 404 status code
        response.setStatus(HttpStatus.NOT_FOUND);

        return response;
    }
}
