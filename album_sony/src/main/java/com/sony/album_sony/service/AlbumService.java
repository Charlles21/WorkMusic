package com.sony.album_sony.service;

import java.util.List;
import java.util.Optional;

import com.sony.album_sony.dto.AlbumDto;
import com.sony.album_sony.model.Album;

public interface AlbumService {
    List <AlbumDto>obterTodosOsAlbuns();
    AlbumDto cadastrarAlbum(AlbumDto album);
    void excluirAlbum(String id);
    AlbumDto alterarAlbum(String id, AlbumDto album);
    AlbumDto obterPorNome(String nome);
    Optional<Album> acharPorId(String id);


}
