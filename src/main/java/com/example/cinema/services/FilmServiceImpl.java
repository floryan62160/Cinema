package com.example.cinema.services;

import com.example.cinema.models.Film;
import com.example.cinema.repositories.FilmRepository;

import java.util.List;
import java.util.Optional;

public class FilmServiceImpl implements FilmService{
    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }


    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Optional<Film> findById(String id) {
        return this.filmRepository.findById(id);
    }

    @Override
    public Film saves(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Film update(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Optional<Film> delete(String id) {
        this.filmRepository.deleteById(id);
        return this.filmRepository.findById(id);
    }
}
