package com.example.backendchallenge.controller;

import com.example.backendchallenge.model.Personaje;
import com.example.backendchallenge.service.PersonajeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonajeController {

    private PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @GetMapping("/characters")
    public List<Personaje> buscarTodosPorFiltro(
            @RequestParam(value = "name", required = false) String name ){
        return personajeService.findByNombre(name);
    }

    @GetMapping("/characters/{id}")
    public Personaje buscarPorId(@PathVariable int id) {
        return personajeService.findById(id);
    }

    @PostMapping("/characters")
    public Personaje guardarPelicula(@RequestBody Personaje personaje) {
        return personajeService.save(personaje);
    }

    @PutMapping("/characters")

    public Personaje actualizarPelicula(@RequestBody Personaje personaje) {
        return personajeService.update(personaje);
    }

    @DeleteMapping("/characters/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) { //throws ResourceNotFoundException {
          personajeService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
    }



}
