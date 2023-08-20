package com.example.SpringBoot_Sample.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.SpringBoot_Sample.domain.Customer;
import com.example.SpringBoot_Sample.service.CustomerService;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    String list(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "list";
    }
}
