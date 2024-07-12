package com.example.springboot.controller;

import com.example.springboot.database.dao.ProductDAO;
import com.example.springboot.database.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public ModelAndView index(@RequestParam(required = false) Integer id) { // http://localhost:8080/?id=2
        ModelAndView response = new ModelAndView("index");
        Product product = productDAO.findById(id);
        response.addObject("message", "Hello World!");
        response.addObject("product", product);

        return response;
    }

    @GetMapping("/index/{id}")
//    public ModelAndView indexPathVar(@PathVariable Integer id) { // http://localhost:8080/index/1
    public ModelAndView indexPathVar(@PathVariable(name = "id") Integer productId) { // http://localhost:8080/index/1
        ModelAndView response = new ModelAndView("index");
        Product product = productDAO.findById(productId);
        response.addObject("message", "Hello World!");
        response.addObject("product", product);

        return response;
    }

    @GetMapping("/another-page-url")
    public ModelAndView anotherPage() {
        ModelAndView response = new ModelAndView("another-page");
        return response;
    }

}
