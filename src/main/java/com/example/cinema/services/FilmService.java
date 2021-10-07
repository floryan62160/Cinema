package com.example.cinema.services;

import com.example.cinema.models.Cinema;
import com.example.cinema.models.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    public List<Film> findAll();
    public Optional<Film> findById(String id);
    public Film saves(Film film);
    public Film update(Film film);
    public Optional<Film> delete(String id);
}
