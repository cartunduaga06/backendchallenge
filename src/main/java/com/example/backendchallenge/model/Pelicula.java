package com.example.backendchallenge.model;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "Pelicula")

public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String imagen;
    private String titulo;
    private String fechaCreacion;
    private String calificacion;


    private Personaje personajes;


}
