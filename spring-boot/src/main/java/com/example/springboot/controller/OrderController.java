package com.example.springboot.controller;

import com.example.springboot.database.dao.OrderDAO;
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
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderDAO orderDAO;

    @GetMapping("/list")
    public ModelAndView employeeDeatails(@RequestParam(required = false) String customerId) {

        ModelAndView response = new ModelAndView("orderList");

        List<Order> orders = orderDAO.findByCustomerId(Integer.valueOf(customerId));
        response.addObject("orders", orders);

        return response;
    }
}
