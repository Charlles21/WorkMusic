package com.sony.music_sony.Model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Artista {

    @Id
    private String id;
    private String nomeArtista;
    private int idade;
    private double altura;


    /*{
        "id" : "id",
        "nomeArtista" : "nome",
        "idade" : 14,
        "altura" : 1.75
      }*/

}
