package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SimpsonDTO {

    private String nombre;
    private String apellido;
    private List<String> hijos;
    private int edad;
    private Boolean esposa;

//    @JsonAlias

}
