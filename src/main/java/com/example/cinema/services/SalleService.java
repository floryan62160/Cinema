package com.example.cinema.services;

import com.example.cinema.models.Salle;

import java.util.List;
import java.util.Optional;

public interface SalleService {
    public List<Salle> findAll();
    public Optional<Salle> findById(String id);
    public Salle saves(Salle salle);
    public Salle update(Salle salle);
    public Optional<Salle> delete(String id);
}
