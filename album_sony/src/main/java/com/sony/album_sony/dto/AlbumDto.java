package com.sony.album_sony.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class AlbumDto {
    
    @Id
    private String id;
    private String dataLancamento;
    private String nome;
    private String duracao;
    
    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }
    
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
