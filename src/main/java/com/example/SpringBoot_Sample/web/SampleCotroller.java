package com.example.SpringBoot_Sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_Sample.domain.Employee;

@Controller
public class SampleCotroller{
    @GetMapping("/")
    String getHello() {
        return "hello";
    }
    
    @PostMapping("/resultCtrl")
    String postResult(@RequestParam("val") String responseVal, Model mdoel) {
        mdoel.addAttribute("responseVal", responseVal);
        return "result";
    }
}
