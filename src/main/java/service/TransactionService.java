package com.akhil.spendwisebackend.service;

import com.akhil.spendwisebackend.model.Transaction;
import com.akhil.spendwisebackend.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repo;

    public TransactionService(TransactionRepository repo) {
        this.repo = repo;
    }

    public List<Transaction> getAll() {
        return repo.findAll();
    }

    public Transaction save(Transaction t) {
        return repo.save(t);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}