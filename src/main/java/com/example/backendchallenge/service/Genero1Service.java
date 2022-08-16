package com.example.backendchallenge.service;

import com.example.backendchallenge.model.Genero1;
import com.example.backendchallenge.repository.GeneroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Genero1Service {

    private GeneroRepository generoRepository;

    public Genero1Service(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public List<Genero1> findAll() {
        return generoRepository.findAll();
    }

    public Genero1 save(Genero1 genero) {
        return generoRepository.save(genero);
    }

    public Genero1 findById(Integer id) {
        return generoRepository.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        generoRepository.deleteById(id);
    }

    public Genero1 update(Genero1 genero) {
        return generoRepository.save(genero);
    }




}
