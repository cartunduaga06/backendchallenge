package com.example.backendchallenge.model;

import javax.persistence.*;


@Entity
@Table (name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String imagen;
    private String nombre;
    private String Edad;
    private String peso;
    private String historia;


    private Pelicula peliculas;
}
