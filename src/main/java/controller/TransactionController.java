package com.akhil.spendwisebackend.controller;

import com.akhil.spendwisebackend.model.Transaction;
import com.akhil.spendwisebackend.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Transaction add(@RequestBody Transaction t) {
        return service.save(t);
    }

    @PutMapping("/{id}")
    public Transaction update(@PathVariable Long id, @RequestBody Transaction t) {
        t.setId(id);
        return service.save(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}