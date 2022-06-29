package com.sony.music_sony.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sony.music_sony.Model.Artista;
import com.sony.music_sony.Services.ArtistaServicesIMPL;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/artista")
public class ArtistaController {

    @Autowired
    ArtistaServicesIMPL artista_ServicesIMPL;


    @GetMapping
    public List<Artista> listarTodos(){

        return artista_ServicesIMPL.listarTodos();
    }

    @PostMapping(path ="/cadastrar")
    public Artista cadastArtista(@RequestBody Artista artista) {       
        
        return this.artista_ServicesIMPL.cadastrar(artista);
    }

    @GetMapping(path ="/{id}")
    public Optional<Artista> acharPorId(@PathVariable String id){
        return artista_ServicesIMPL.acharPorId(id);
    }
    
}
