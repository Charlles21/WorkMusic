package com.sony.music_sony.Services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.music_sony.Feign.ArtistaComAlbum;
import com.sony.music_sony.Feign.FeignArtista;
import com.sony.music_sony.Model.Artista;
import com.sony.music_sony.Repository.ArtistaRepository;
@Service
public class ArtistaServicesIMPL implements ArtistaServices {

    @Autowired
    ArtistaRepository artista_repository;

    @Autowired
    FeignArtista feign_Artista;
    
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
    public Artista editarPorId(Artista artista) {
        
        return artista_repository.save(artista);
    }

    @Override
    public void deletarPorId(String id) {
        artista_repository.deleteById(id);        
    }

    @Override
    public Optional<ArtistaComAlbum> obterPorID(String id) {
        Optional<Artista> artista = artista_repository.findById(id);
        
        if(artista.isPresent()){
            ArtistaComAlbum Artista_dto = new ModelMapper().map(artista.get(), ArtistaComAlbum.class);
            Artista_dto.setAlbuns(feign_Artista.obterAlbum(id));
            return Optional.of(Artista_dto);
        }
        
        return Optional.empty();
    }

    
    
}
