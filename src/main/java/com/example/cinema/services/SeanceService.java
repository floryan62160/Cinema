package com.example.cinema.services;

import com.example.cinema.models.Film;
import com.example.cinema.models.Salle;
import com.example.cinema.models.Seance;

import java.util.List;
import java.util.Optional;

public interface SeanceService {
    public List<Seance> findAll();
    public Optional<Seance> findById(String id);
    public Seance saves(Seance seance);
    public Seance update(Seance seance);
    public Optional<Seance> delete(String id);
}
