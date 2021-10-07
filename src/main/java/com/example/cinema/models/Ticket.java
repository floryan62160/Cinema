package com.example.cinema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Ticket {
    @Id
    private String id;


    @DBRef
    @Field("Cinema")
    private Cinema cinema;

    @DBRef
    @Field("Film")
    private Film film;

    private String dateDebut;
    private String dateFin;

    @DBRef
    @Field("Salle")
    private Salle salle;


    public String getCinema(){
        return cinema.getNom();
    }


    public String getFilm(){
        return film.getNom();
    }


    public Integer getSalle(){
        return salle.getNumSalle();
    }
}
