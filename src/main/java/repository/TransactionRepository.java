package com.akhil.spendwisebackend.repository;

import com.akhil.spendwisebackend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}