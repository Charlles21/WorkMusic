package com.sony.music_sony.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.sony.music_sony.Model.Artista;


public interface ArtistaRepository extends MongoRepository<Artista, String>{
    
}
