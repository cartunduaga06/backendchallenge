package com.example.backendchallenge.controller;

import com.example.backendchallenge.model.Personaje;
import com.example.backendchallenge.service.PersonajeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonajeController {

    private PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @GetMapping("/buscartodos")
    public List<Personaje> buscarTodos() {
        return personajeService.findAll();
    }

}
