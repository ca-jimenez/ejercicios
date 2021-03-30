package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PotterDTO {

    private String nombre;
    private List<String> colores;
    private List<EstudianteDTO> integrantes;

}
