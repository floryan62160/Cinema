package com.example.cinema.controllers;

import com.example.cinema.models.Cinema;
import com.example.cinema.services.CinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cinema")
@CrossOrigin
public class CinemaController {

    private CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<Cinema> findAll(){
        return this.cinemaService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Cinema> findById(@PathVariable  String id){
        return this.cinemaService.findById(id);
    }

    @PostMapping
    public Cinema saves(@RequestBody Cinema cinema){
        return this.cinemaService.saves(cinema);
    }

    @PutMapping
    public Cinema update(@RequestBody Cinema cinema){
        return this.cinemaService.update(cinema);
    }

    @DeleteMapping("{id}")
    public Optional<Cinema> delete(@PathVariable String id){
        return this.cinemaService.delete(id);
    }
}
