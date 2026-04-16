package com.akhil.spendwisebackend.controller;

import com.akhil.spendwisebackend.model.Budget;
import com.akhil.spendwisebackend.service.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
@CrossOrigin
public class BudgetController {

    private final BudgetService service;

    public BudgetController(BudgetService service) {
        this.service = service;
    }

    // GET budgets by month & year
    @GetMapping
    public List<Budget> get(
            @RequestParam int month,
            @RequestParam int year) {
        return service.getBudgets(month, year);
    }

    // SAVE budget
    @PostMapping
    public Budget save(@RequestBody Budget b) {
        return service.save(b);
    }
}