package com.sony.album_sony.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.album_sony.dto.AlbumDto;
import com.sony.album_sony.model.Album;
import com.sony.album_sony.repository.AlbumRepository;

@Service
public class AlbumServiceImpl implements AlbumService {
    

    @Autowired
    private AlbumRepository repository;

    private ModelMapper mapper = new ModelMapper();
    
    @Override
    public List<AlbumDto> obterTodosOsAlbuns(){
        List<Album> albuns = repository.findAll();

        return albuns.stream()
            .map(a -> mapper.map(a, AlbumDto.class)) 
            .collect(Collectors.toList());
            
    }

    @Override
    public AlbumDto cadastrarAlbum(AlbumDto album) {
        Album albumSalvar = mapper.map(album, Album.class);
        repository.save(albumSalvar);
        return mapper.map(albumSalvar, AlbumDto.class);
    }

    @Override
    public void excluirAlbum(String id) {
        repository.deleteById(id);
    }

    @Override
    public AlbumDto alterarAlbum(String id, AlbumDto album) {
        Optional<Album>albumBusca = repository.findById(id);

        if (albumBusca.isPresent()) {
            Album albumAlterar = mapper.map(album, Album.class);
            albumAlterar.setId(id);
            albumAlterar = repository.save(albumAlterar);
            return mapper.map(albumAlterar, AlbumDto.class);            
        }
        return null;
    }

    @Override
    public AlbumDto obterPorNome(String nome) {
        Album album = repository.findByNome(nome);    
    return mapper.map(album, AlbumDto.class);
    }

    @Override
    public Optional<Album> acharPorId(String id) {
        
        return repository.findById(id);
    }

}
