package com.akhil.spendwisebackend.service;

import com.akhil.spendwisebackend.model.Budget;
import com.akhil.spendwisebackend.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository repo;

    public BudgetService(BudgetRepository repo) {
        this.repo = repo;
    }

    public List<Budget> getBudgets(int month, int year) {
        return repo.findByMonthAndYear(month, year);
    }

    public Budget save(Budget b) {
        return repo.save(b);
    }
}