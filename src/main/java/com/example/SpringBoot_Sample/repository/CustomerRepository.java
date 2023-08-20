package com.example.SpringBoot_Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot_Sample.domain.Customer;

// JpaRepositoryを継承したインターフェースを作成する。
// public interface 名前 extends JpaRepository <エンティティ , 主キーの型> のように書く。
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
