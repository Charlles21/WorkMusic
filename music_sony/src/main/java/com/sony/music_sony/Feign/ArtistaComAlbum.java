package com.sony.music_sony.Feign;

import java.util.List;

import com.sony.music_sony.Model.Album;
import com.sony.music_sony.Model.Artista;

public class ArtistaComAlbum extends Artista{
    
    private List<Album> albuns;

    public List<Album> pegaAlbuns(){
        return albuns;
    }

    public void setAlbuns(List<Album> albuns){
        this.albuns = albuns;
        
    }
}
