package com.sony.music_sony.Feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sony.music_sony.Model.Album;


@FeignClient("album-ms")
public interface FeignArtista {
    
    @RequestMapping(method = RequestMethod.GET, value = "/achar_por_id/{id}")
    Album obterAlbumPorId(@PathVariable String id);
}
