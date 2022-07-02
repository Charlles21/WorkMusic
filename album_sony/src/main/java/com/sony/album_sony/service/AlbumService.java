package com.sony.album_sony.service;

import java.util.List;

import com.sony.album_sony.dto.AlbumDto;

public interface AlbumService {
    List <AlbumDto>obterTodosOsAlbuns();
    AlbumDto cadastrarAlbum(AlbumDto album);
    void excluirAlbum(String id);
    AlbumDto alterarAlbum(String id, AlbumDto album);
    AlbumDto obterPorNome(String nome);
}
