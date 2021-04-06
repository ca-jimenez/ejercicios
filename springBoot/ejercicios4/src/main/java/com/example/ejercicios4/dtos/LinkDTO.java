package com.example.ejercicios4.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkDTO {

    private String url;
    private boolean valid;
    private Integer contador;
    private String password;

    public LinkDTO(String url){
        this.url = url;
        password = null;
        contador = 0;
        valid = true;
    }

    public LinkDTO(String url, String password){
        this.url = url;
        this.password = password;
        contador = 0;
        valid = true;
    }
}
