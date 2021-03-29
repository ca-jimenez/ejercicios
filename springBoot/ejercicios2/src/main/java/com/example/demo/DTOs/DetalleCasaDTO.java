package com.example.demo.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
public class DetalleCasaDTO {
    private double areaTotal;
    private double valor;
    private HabitacionDTO habitacionMasGrande;
    private Map<HabitacionDTO, Double> areaPorHabitacion;
}
