package com.example.SpringBoot_Sample.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.SpringBoot_Sample.domain.Customer;
import com.example.SpringBoot_Sample.domain.Student;
import com.example.SpringBoot_Sample.service.CustomerService;
import com.example.SpringBoot_Sample.service.StudentService;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    StudentService studentService;

    @GetMapping("/customer")
    String list(Model model) {
        List<Customer> customers = customerService.findAll();
        List<Student> students = studentService.findAll();
        model.addAttribute("customers", customers);
        model.addAttribute("students", students);
        return "list";
    }
}
