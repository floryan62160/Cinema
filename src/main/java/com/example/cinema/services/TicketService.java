package com.example.cinema.services;

import com.example.cinema.models.Cinema;
import com.example.cinema.models.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    public List<Ticket> findAll();
    public Optional<Ticket> findById(String id);
    public Ticket saves(Ticket ticket);
    public Ticket update(Ticket ticket);
    public Optional<Ticket> delete(String id);
}
