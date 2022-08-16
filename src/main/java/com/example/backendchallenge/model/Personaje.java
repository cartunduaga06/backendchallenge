package com.example.backendchallenge.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)

    private List<Pelicula> peliculas = new ArrayList<>();

    public Personaje(Integer id, String imagen, String nombre, String edad, String peso, String historia, List<Pelicula> peliculas) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        Edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculas = peliculas;
    }

    public Personaje() {
    }

    public Personaje(String imagen, String nombre, String edad, String peso, String historia, List<Pelicula> peliculas) {
        this.imagen = imagen;
        this.nombre = nombre;
        Edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculas = peliculas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas.add(peliculas);
    }
}
