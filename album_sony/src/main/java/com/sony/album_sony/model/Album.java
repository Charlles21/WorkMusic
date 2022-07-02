package com.sony.album_sony.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Album {
    
    private Date dataLancamento;
    private String nome;
    private String duracao;   
    

    public Date getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(Date dataLancamento) {
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

    public void setId(String id) {
    }

}
