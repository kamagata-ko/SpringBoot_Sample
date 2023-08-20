package com.example.SpringBoot_Sample.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // JPAのエンティティであることを示す。
@Table(name = "customer") // テンティティに対応するテーブル名を指定
@Data
@AllArgsConstructor // 全ての引数を持つコンストラクタを生成
@NoArgsConstructor // 引数を持たないコンストラクタを生成
public class Customer {
    @Id // 主キーのカラムにつける
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主キーが自動採番されることを示す。
    private Integer id;
    @Column(nullable = false) // NotNull制約を示す。
    private String name;
    private String email;
}
