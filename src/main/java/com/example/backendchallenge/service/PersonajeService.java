package com.example.backendchallenge.service;

import com.example.backendchallenge.model.Personaje;
import com.example.backendchallenge.repository.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    private PersonajeRepository personajeRepository;

    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    public Personaje save(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public Personaje findById(Integer id) {
        return personajeRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        personajeRepository.deleteById(id);
    }

    public Personaje update(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public List<Personaje> findByNombre(String nombre) {
        return personajeRepository.findByNombre(nombre);
    }

}
