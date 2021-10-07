package com.example.cinema.repositories;

import com.example.cinema.models.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CinemaRepository extends MongoRepository<Cinema,String> {
}
