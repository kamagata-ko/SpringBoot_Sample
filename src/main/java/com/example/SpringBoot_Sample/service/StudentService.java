package com.example.SpringBoot_Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBoot_Sample.domain.Student;
import com.example.SpringBoot_Sample.repository.StudentRepository;


@Service
@Transactional
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student> findAll(){
        return repo.findAll();
    }
}
