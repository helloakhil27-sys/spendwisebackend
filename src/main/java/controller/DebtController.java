package com.akhil.spendwisebackend.controller;

import com.akhil.spendwisebackend.model.Debt;
import com.akhil.spendwisebackend.service.DebtService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/debts")
@CrossOrigin
public class DebtController {

    private final DebtService service;

    public DebtController(DebtService service) {
        this.service = service;
    }

    @GetMapping
    public List<Debt> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Debt add(@RequestBody Debt d) {
        return service.save(d);
    }

    @PutMapping("/{id}/settle")
    public Debt settle(@PathVariable Long id) {
        return service.settle(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}