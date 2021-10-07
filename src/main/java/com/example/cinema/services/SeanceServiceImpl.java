package com.example.cinema.services;

import com.example.cinema.models.Film;
import com.example.cinema.models.Seance;
import com.example.cinema.repositories.SeanceRepository;

import java.util.List;
import java.util.Optional;

public class SeanceServiceImpl implements SeanceService{
    private SeanceRepository seanceRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Optional<Seance> findById(String id) {
        return this.seanceRepository.findById(id);
    }

    @Override
    public Seance saves(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Seance update(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Optional<Seance> delete(String id) {
        this.seanceRepository.deleteById(id);
        return this.seanceRepository.findById(id);
    }
}
