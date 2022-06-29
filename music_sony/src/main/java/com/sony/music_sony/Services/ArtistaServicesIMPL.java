package com.sony.music_sony.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.music_sony.Model.Artista;
import com.sony.music_sony.Repository.ArtistaRepository;
@Service
public class ArtistaServicesIMPL implements ArtistaServices {

    @Autowired
    ArtistaRepository artista_repository;
    
    @Override
    public List<Artista> listarTodos() {         
        return artista_repository.findAll();
    }

    @Override
    public Optional<Artista> acharPorId(String id) {        
        return artista_repository.findById(id);
    }

    @Override
    public Artista cadastrar(Artista artista) {        
        return artista_repository.save(artista);
    }

    @Override
    public Artista editarPorId(String id, Artista artista) {
        
        return null;
    }

    @Override
    public void deletarPorId(String id) {
        // TODO Auto-generated method stub
        
    }

    
    
}
