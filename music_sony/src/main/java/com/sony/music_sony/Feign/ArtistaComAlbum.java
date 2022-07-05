package com.sony.music_sony.Feign;

import com.sony.music_sony.Model.Album;
import com.sony.music_sony.Model.Artista;

public class ArtistaComAlbum extends Artista{

    private Album album;
    
    public Album getAlbumComDetalhe(){
        return album;
    }

    public void setAlbumComDetalhe(Album album){
        this.album = album;
    }

    
}
