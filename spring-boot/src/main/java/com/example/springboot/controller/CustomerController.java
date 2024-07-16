package com.example.springboot.controller;

import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.dao.OrderDAO;
import com.example.springboot.database.entity.Customer;

import com.example.springboot.database.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private OrderDAO orderDAO;

    @GetMapping("/details")
    public ModelAndView customerDetails(@RequestParam(required = false) String customerId) {

        ModelAndView response = new ModelAndView("customerDetails");

        Customer customer = customerDAO.findById(Integer.valueOf(customerId));
        response.addObject("customer", customer);

        List<Order> orders = orderDAO.findByCustomerId(Integer.valueOf(customerId));
        response.addObject("orders", orders);

        log.info("customerId is: " + customerId);
        log.info("customer is: " + customer);


        return response;
    }
}
