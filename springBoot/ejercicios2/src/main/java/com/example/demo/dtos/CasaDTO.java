package com.example.demo.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CasaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;
    private double valorMetroCuadrado;
}
