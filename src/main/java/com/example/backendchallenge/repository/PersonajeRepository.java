package com.example.backendchallenge.repository;

import com.example.backendchallenge.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {

    //buscar POR NOMBRE

    List<Personaje> findByNombre(String nombre);







}

