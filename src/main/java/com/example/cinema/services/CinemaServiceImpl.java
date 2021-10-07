package com.example.cinema.services;

import com.example.cinema.models.Cinema;
import com.example.cinema.repositories.CinemaRepository;

import java.util.List;
import java.util.Optional;

public class CinemaServiceImpl implements CinemaService{

    private CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public List<Cinema> findAll() {
        return this.cinemaRepository.findAll();
    }

    @Override
    public Optional<Cinema> findById(String id) {
        return this.cinemaRepository.findById(id);
    }

    @Override
    public Cinema saves(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public Cinema update(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public Optional<Cinema> delete(String id) {
        this.cinemaRepository.deleteById(id);
        return this.cinemaRepository.findById(id);
    }
}
