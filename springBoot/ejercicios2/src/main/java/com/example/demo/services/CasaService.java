package com.example.demo.services;


import com.example.demo.dtos.CasaDTO;
import com.example.demo.dtos.DetalleCasaDTO;
import com.example.demo.dtos.HabitacionDTO;

import java.util.HashMap;
import java.util.Map;

public class CasaService {

    public static DetalleCasaDTO getDetalle(CasaDTO casa) {

        Map<HabitacionDTO, Double> areasPorHabitacion = calcularAreaHabitaciones(casa);
        double areaTotal = calcularAreaTotal(areasPorHabitacion);

        return new DetalleCasaDTO(areaTotal,
                calcularValor(areaTotal, casa.getValorMetroCuadrado()),
                getHabitacionMasGrande(areasPorHabitacion),
                areasPorHabitacion
        );
    }

    private static HabitacionDTO getHabitacionMasGrande(Map<HabitacionDTO, Double> areasPorHabitacion) {

        HabitacionDTO habitacionMasGrande = null;
        Double areaMasGrande = 0.0;

        for (Map.Entry<HabitacionDTO, Double> entry : areasPorHabitacion.entrySet()) {
            if (entry.getValue() > areaMasGrande) {
                areaMasGrande = entry.getValue();
                habitacionMasGrande = entry.getKey();
            }
        }

        return habitacionMasGrande;
    }

    private static double calcularValor(double areaTotal, double valorMetroCuadrado) {
        return areaTotal * valorMetroCuadrado;
    }

    private static double calcularAreaTotal(Map<HabitacionDTO, Double> areas) {
        double areaTotal = 0;

        for (Double area : areas.values()) {
            areaTotal += area;
        }

        return areaTotal;
    }

    private static Map<HabitacionDTO, Double> calcularAreaHabitaciones(CasaDTO casa) {

        HashMap<HabitacionDTO, Double> areasPorHabitacion = new HashMap<>();

        for (HabitacionDTO habitacion : casa.getHabitaciones()) {
            areasPorHabitacion.put(habitacion, habitacion.getAncho() * habitacion.getLargo());
        }

        return areasPorHabitacion;
    }

}
