package com.example.SpringBoot_Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBoot_Sample.domain.Sales;
import com.example.SpringBoot_Sample.repository.SalesRepository;

@Service
@Transactional
public class SalesService {

    @Autowired
    SalesRepository repository;

    public List<Sales> findAll() {
        return repository.findAll();
    }
    
}
