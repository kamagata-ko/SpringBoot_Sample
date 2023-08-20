package com.example.SpringBoot_Sample.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主キーが自動採番されることを示す。
    private Long studentId;
    private String studentNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthday;
    private String gender;
    private boolean paidFlag;
}
