package com.example.backendchallenge.repository;

import com.example.backendchallenge.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {

}

