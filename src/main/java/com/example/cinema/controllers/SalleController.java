package com.example.cinema.controllers;


import com.example.cinema.models.Salle;
import com.example.cinema.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("salle")
@CrossOrigin
public class SalleController {

    private SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> findAll(){
        return this.salleService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Salle> findById(@PathVariable String id){
        return this.salleService.findById(id);
    }

    @PostMapping
    public Salle saves(@RequestBody Salle salle){
        return this.salleService.saves(salle);
    }

    @PutMapping
    public Salle update(@RequestBody Salle salle){
        return this.salleService.update(salle);
    }

    @DeleteMapping("{id}")
    public Optional<Salle> delete(@PathVariable String id){
        return this.salleService.delete(id);
    }
}
