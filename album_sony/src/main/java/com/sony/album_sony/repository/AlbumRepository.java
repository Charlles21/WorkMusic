package com.sony.album_sony.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sony.album_sony.model.Album;
@Repository
public interface AlbumRepository extends MongoRepository<Album,String> {

    Album findByNome(String nome);


    
}
