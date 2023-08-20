package com.example.SpringBoot_Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBoot_Sample.domain.Customer;
import com.example.SpringBoot_Sample.repository.CustomerRepository;

@Service // サービスクラスであることを示し、クラスのBeanをDIコンテナに登録する。
@Transactional // DBのトランザクション制御
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
}
