package com.akhil.spendwisebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String person;
    private double amount;
    private String type;   // "GIVEN" or "TAKEN"
    private boolean settled;
}