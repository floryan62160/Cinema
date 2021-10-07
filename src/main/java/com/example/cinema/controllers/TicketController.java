package com.example.cinema.controllers;

import com.example.cinema.models.Ticket;
import com.example.cinema.services.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("ticket")
@CrossOrigin
public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> findAll(){
        return this.ticketService.findAll();
    }

    @GetMapping("myticket/{id}")
    public Optional<Ticket> findById(@PathVariable String id){
        return this.ticketService.findById(id);
    }

    @PostMapping
    public Ticket saves(@RequestBody Ticket ticket){
        return this.ticketService.saves(ticket);
    }


    @PutMapping
    public Ticket update(@RequestBody Ticket ticket){
        return this.ticketService.update(ticket);
    }

    @DeleteMapping("{id}")
    public Optional<Ticket> delete(@PathVariable String id){
        return this.ticketService.delete(id);
    }
}
