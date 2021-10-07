package com.example.cinema.services;

import com.example.cinema.models.Ticket;
import com.example.cinema.repositories.TicketRepository;

import java.util.List;
import java.util.Optional;

public class TicketServiceImpl implements TicketService{
    private TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


    @Override
    public List<Ticket> findAll() {
        return this.ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> findById(String id) {
        return this.ticketRepository.findById(id);
    }

    @Override
    public Ticket saves(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }

    @Override
    public Optional<Ticket> delete(String id) {
        this.ticketRepository.deleteById(id);
        return this.ticketRepository.findById(id);
    }
}
