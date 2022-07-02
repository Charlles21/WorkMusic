package com.sony.music_sony.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sony.music_sony.Model.Artista;

@Repository
public interface ArtistaRepository extends MongoRepository<Artista, String>{
    
}
