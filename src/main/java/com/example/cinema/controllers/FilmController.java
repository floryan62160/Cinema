package com.example.cinema.controllers;


import com.example.cinema.models.Cinema;
import com.example.cinema.models.Film;
import com.example.cinema.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("film")
@CrossOrigin
public class FilmController {
    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll(){
        return this.filmService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Film> findById(@PathVariable String id){
        return this.filmService.findById(id);
    }

    @PostMapping
    public Film saves(@RequestBody Film film){
        return this.filmService.saves(film);
    }

    @PutMapping
    public Film update(@RequestBody Film film){
        return this.filmService.update(film);
    }

    @DeleteMapping("{id}")
    public Optional<Film> delete(@PathVariable String id){
        return this.filmService.delete(id);
    }
}
