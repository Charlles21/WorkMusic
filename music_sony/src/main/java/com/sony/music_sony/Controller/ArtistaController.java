package com.sony.music_sony.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sony.music_sony.Feign.ArtistaComAlbum;
import com.sony.music_sony.Model.Artista;
import com.sony.music_sony.Services.ArtistaServicesIMPL;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping(path ="/cadastrar")
    public Artista cadastArtista(@RequestBody Artista artista) {       
        
        return this.artista_ServicesIMPL.cadastrar(artista);
    }

    @GetMapping(path = "/{id}")
    public Optional<Artista> acharPorId(@PathVariable String id){
        return artista_ServicesIMPL.acharPorId(id);
    }

    @PostMapping(path = "/editar/{id}")
    public Artista editarPorId(@PathVariable String id, @RequestBody Artista artista){

        return artista_ServicesIMPL.editarPorId(artista);
    }

    @DeleteMapping(path = "/deletar/{id}")
    public String deletarPorId(@PathVariable String id){
        artista_ServicesIMPL.deletarPorId(id);

        return "Deletado com sucesso";
    }

    @GetMapping(value="/album/{id}")
    public ResponseEntity<ArtistaComAlbum> obterPorId(@PathVariable String id){
            Optional<ArtistaComAlbum> artista = artista_ServicesIMPL.obterPorID(id);
            if(artista.isPresent()){
               return new ResponseEntity<>(artista.get(), HttpStatus.OK);    
            }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    

    
}
