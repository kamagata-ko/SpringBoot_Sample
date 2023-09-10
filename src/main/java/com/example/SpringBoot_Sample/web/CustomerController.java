package com.example.SpringBoot_Sample.web;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SpringBoot_Sample.domain.Customer;
import com.example.SpringBoot_Sample.domain.Sales;
import com.example.SpringBoot_Sample.domain.Student;
import com.example.SpringBoot_Sample.service.CustomerService;
import com.example.SpringBoot_Sample.service.SalesService;
import com.example.SpringBoot_Sample.service.StudentService;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    // @Autowired
    // StudentService studentService;

    // @Autowired
    // SalesService salesService;

    @GetMapping("/customer")
    String list(Model model) {
        List<Customer> customers = customerService.findAll();
        // List<Student> students = studentService.findAll();
        // List<Sales> salesList = salesService.findAll();


        // List<Sales> salesCulcList = salesService.findAll();
        // Map<String, Double> result = salesCulcList.stream().collect(Collectors.groupingBy(Sales::getProductName, Collectors.averagingDouble(Sales::getQuantity)));



        model.addAttribute("customers", customers);
        // model.addAttribute("students", students);
        // model.addAttribute("salesList", salesList);

        // model.addAttribute("salesAvgMap", result);
        return "list";
    }

    @GetMapping("create")
    String create(@ModelAttribute CustomerForm customerForm) {
        return "create";
    }

    @PostMapping("create")
    String regist(@ModelAttribute @Validated CustomerForm customerForm, BindingResult result, Model model){
        if (result.hasErrors()) {
            return create(customerForm);
        }
        
        Customer customer = new Customer();
        
        BeanUtils.copyProperties(customerForm, customer);

        customerService.insert(customer);

        return "redirect:/";
    }
}
