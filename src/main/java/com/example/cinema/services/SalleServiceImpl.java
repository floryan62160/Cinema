package com.example.cinema.services;

import com.example.cinema.models.Salle;
import com.example.cinema.repositories.SalleRepository;

import java.util.List;
import java.util.Optional;

public class SalleServiceImpl implements SalleService{

    private SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }


    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Optional<Salle> findById(String id) {
        return this.salleRepository.findById(id);
    }

    @Override
    public Salle saves(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle update(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Optional<Salle> delete(String id) {
        this.salleRepository.deleteById(id);
        return this.salleRepository.findById(id);
    }
}
