package com.example.ejercicios3.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HabitacionDTO {
    private String nombre;
    private double largo;
    private double ancho;
}
