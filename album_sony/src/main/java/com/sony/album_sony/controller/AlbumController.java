package com.sony.album_sony.controller;

import java.util.List;
import java.util.Optional;

import com.sony.album_sony.dto.AlbumDto;
import com.sony.album_sony.model.Album;
import com.sony.album_sony.service.AlbumService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/albuns")
public class AlbumController {

    @Autowired
    private AlbumService service;

    @GetMapping
    public List<AlbumDto> obterAlbuns(){
        return service.obterTodosOsAlbuns();
    }

    @GetMapping(path="/achar_por_id/{id}")
    public Optional<Album> acharPorId(@PathVariable String id){

        return service.acharPorId(id);
    }
    
    @PostMapping("/cadastrar")
    public ResponseEntity<AlbumDto> cadastrarAlbum(@RequestBody AlbumDto album){
        return new ResponseEntity<>(service.cadastrarAlbum(album), HttpStatus.CREATED);
    } 

    @DeleteMapping("/deletar/{id}")
    public void excluirAlbum(@PathVariable String id){
        service.excluirAlbum(id);
    }

    @PutMapping("/{id}")
    public AlbumDto alterarAlbum(@PathVariable String id, @RequestBody AlbumDto albumAlterar){
        return service.alterarAlbum(id, albumAlterar);
    }

    @GetMapping("/nome/{nome}")
    public AlbumDto obterPorNome(@PathVariable String nome){
        return service.obterPorNome(nome);
    }

}
