package com.sony.music_sony.Services;

import java.util.List;
import java.util.Optional;

import com.sony.music_sony.Feign.ArtistaComAlbum;
import com.sony.music_sony.Model.Artista;

public interface ArtistaServices {

    public List<Artista> listarTodos();   
    
    public Optional<Artista> acharPorId(String id);

    public Artista cadastrar(Artista artista);

    public Artista editarPorId(Artista artista);
    
    public void deletarPorId(String id);

    Optional<ArtistaComAlbum> obterPorID(String id);
    
}
