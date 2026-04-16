package com.akhil.spendwisebackend.service;

import com.akhil.spendwisebackend.model.Debt;
import com.akhil.spendwisebackend.repository.DebtRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtService {

    private final DebtRepository repo;

    public DebtService(DebtRepository repo) {
        this.repo = repo;
    }

    public List<Debt> getAll() {
        return repo.findAll();
    }

    public Debt save(Debt d) {
        return repo.save(d);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Debt settle(Long id) {
        Debt d = repo.findById(id).orElseThrow();
        d.setSettled(true);
        return repo.save(d);
    }
}