package com.example.cinema;

import com.example.cinema.repositories.*;
import com.example.cinema.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public CinemaService cinemaService(CinemaRepository cinemaRepository){
        return new CinemaServiceImpl(cinemaRepository);
    }

    @Bean
    public SalleService salleService(SalleRepository salleRepository){
        return new SalleServiceImpl(salleRepository);
    }

    @Bean
    public FilmService filmService(FilmRepository filmRepository){
        return new FilmServiceImpl(filmRepository);
    }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository){
        return new SeanceServiceImpl(seanceRepository);
    }

    @Bean
    public TicketService ticketService(TicketRepository ticketRepository){
        return new TicketServiceImpl(ticketRepository);
    }
}
