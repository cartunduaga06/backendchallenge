package com.example.backendchallenge.repository;

import com.example.backendchallenge.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}

