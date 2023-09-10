package com.example.SpringBoot_Sample.web;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerForm {
    private Integer id;
    @NotBlank
    @Size(min = 1, max = 20)
    private String name;
    @Size(max = 100)
    private String email;
}
