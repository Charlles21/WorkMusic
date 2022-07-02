package com.sony.music_sony.Feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sony.music_sony.Model.Album;

@FeignClient("Album-ms")
public interface FeignArtista {
    
    @RequestMapping(method = RequestMethod.GET, value = "/album/{artista}")
    List<Album> obterAlbum(@PathVariable String artista);
}
