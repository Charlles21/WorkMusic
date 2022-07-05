package com.sony.music_sony.Model;

import java.util.Date;

public class Album {
    private String id;
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    

    
}
