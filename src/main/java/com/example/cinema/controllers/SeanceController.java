package com.example.cinema.controllers;


import com.example.cinema.models.Film;
import com.example.cinema.models.Seance;
import com.example.cinema.services.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("seance")
@CrossOrigin
public class SeanceController {
    private SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @GetMapping
    public List<Seance> findAll(){
        return this.seanceService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Seance> findById(@PathVariable String id){
        return this.seanceService.findById(id);
    }

    @PostMapping
    public Seance saves(@RequestBody Seance seance){
        return this.seanceService.saves(seance);
    }

    @PutMapping
    public Seance update(@RequestBody Seance seance){
        return this.seanceService.update(seance);
    }

    @DeleteMapping("{id}")
    public Optional<Seance> delete(@PathVariable String id){
        return this.seanceService.delete(id);
    }
}
