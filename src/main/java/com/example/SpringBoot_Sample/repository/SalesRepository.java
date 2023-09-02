package com.example.SpringBoot_Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot_Sample.domain.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
    
}
