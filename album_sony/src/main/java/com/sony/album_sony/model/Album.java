package com.sony.album_sony.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Album {
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

    public void setId(String id) {
    }
    public String getId() {
        return id;
    }

    /*{
        "dataLancamento": 01/02/2022,
        "nome": "teste",
        "duracao": 77 minutos
   
    }*/

}
