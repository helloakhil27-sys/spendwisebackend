package com.akhil.spendwisebackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private double amount;
    private int month;
    private int year;
}