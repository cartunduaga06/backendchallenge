package com.example.backendchallenge.controller;

import com.example.backendchallenge.model.Genero1;
import com.example.backendchallenge.service.Genero1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    private Genero1Service generoService;

    public GeneroController(Genero1Service generoService) {
        this.generoService = generoService;
    }

    @GetMapping("/buscartodos")
    public List<Genero1> buscarTodos() {
        return generoService.findAll();
    }

    @GetMapping("/buscarPorId/{id}")
    public Genero1 buscarPorId(@PathVariable int id) {
        return generoService.findById(id);
    }

    @PostMapping("/guardar")
    public Genero1 guardarPelicula(@RequestBody Genero1 genero) {
        return generoService.save(genero);
    }

    @PutMapping("/actualizar")
    public Genero1 actualizarPelicula(@RequestBody Genero1 genero) {
        return generoService.update(genero);
    }

}
