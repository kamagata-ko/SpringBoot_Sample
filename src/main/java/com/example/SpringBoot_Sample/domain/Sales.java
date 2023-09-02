package com.example.SpringBoot_Sample.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales {
    @Id
    private Integer saleId;
    private Integer productId;
    private String productName;
    private LocalDate saleDate;
    private Integer quantity;
}
