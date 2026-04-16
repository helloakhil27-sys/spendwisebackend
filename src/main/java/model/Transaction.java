package com.akhil.spendwisebackend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double amount;
    private String type;
    private String category;
    @Column(nullable = true)
    private String tag;
    private LocalDate date;
    private String notes;
}