package com.example.SpringBoot_Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot_Sample.domain.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{
    
}
