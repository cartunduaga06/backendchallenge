package com.example.backendchallenge.controller;

import com.example.backendchallenge.model.Pelicula;
import com.example.backendchallenge.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/movies")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;


    @GetMapping(path = "/buscartodos")
    public List<Pelicula> buscarTodos() {
        return  peliculaService.buscarTodos();
    }

    @GetMapping(path = "/buscarPorId/{id}")
    public Pelicula buscarPorId(@PathVariable int id) {
        return  peliculaService.buscar(id);
    }

    @PostMapping(path = "/guardar")
    public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
        return  peliculaService.guardar(pelicula);
    }

    @PutMapping(path = "/actualizar")
    public Pelicula actualizarPelicula(@RequestBody Pelicula pelicula) {
        return  peliculaService.actualizar(pelicula);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) { //throws ResourceNotFoundException {
          peliculaService.eliminar(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
    }


}
