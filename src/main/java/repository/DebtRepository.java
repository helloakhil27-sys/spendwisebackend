package com.akhil.spendwisebackend.repository;

import com.akhil.spendwisebackend.model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtRepository extends JpaRepository<Debt, Long> {
}