package com.example.backendchallenge.service;

import com.example.backendchallenge.model.Pelicula;
import com.example.backendchallenge.repository.PeliculaRepository;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {

    private PeliculaRepository peliculaRepository;

    private static final Logger logger =  Logger.getLogger(PeliculaService.class);

    public PeliculaService(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public Pelicula guardar(Pelicula p) {
        return peliculaRepository.save(p);
    }

    public Pelicula buscar(Integer id) {
        Pelicula pelicula = null;
        Optional<Pelicula> optionalPelicula = peliculaRepository.findById(id);
        if (optionalPelicula.isPresent()) {
            pelicula = optionalPelicula.get();
        }
        logger.info("Pelicula encontrada: " + pelicula);
        return pelicula;
    }

    public List<Pelicula> buscarTodos() {
        return peliculaRepository.findAll();
    }

public void eliminar(Integer id) //throws  ResourceNotFoundException {
{
        if(this.buscar(id) == null){
            logger.error("Pelicula no existe con id " + id);
            //throw new ResourceNotFoundException( "Pelicula no existe con id " + id );

        } else
        {
            logger.info("Pelicula eliminada: " + id);
            peliculaRepository.deleteById(id);
        }
    }

    public Pelicula actualizar(Pelicula p) {
        return peliculaRepository.save(p);
    }

}
