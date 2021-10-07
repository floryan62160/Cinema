package com.example.cinema.services;

import com.example.cinema.models.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaService {
    public List<Cinema> findAll();
    public Optional<Cinema> findById(String id);
    public Cinema saves(Cinema cinema);
    public Cinema update(Cinema cinema);
    public Optional<Cinema> delete(String id);
}
