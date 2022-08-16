package com.example.backendchallenge.model;

import javax.persistence.*;

@Entity
@Table(name = "Genero")
public class Genero1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nombre;
    private String imagen;



    public Genero1(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Genero1() {
    }

    public Genero1(Integer id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }




}
