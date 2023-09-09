package com.example.SpringBoot_Sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.SpringBoot_Sample.domain.Customer;

// JpaRepositoryを継承したインターフェースを作成する。
// public interface 名前 extends JpaRepository <エンティティ , 主キーの型> のように書く。
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    // @Query("SELECT u FROM Customer ORDER BY u.id")
    // List<Customer> findAllOrderById();
}
