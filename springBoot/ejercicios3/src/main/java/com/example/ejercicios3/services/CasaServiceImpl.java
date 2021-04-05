package com.example.ejercicios3.services;


import com.example.ejercicios3.dtos.CasaDTO;
import com.example.ejercicios3.dtos.DetalleCasaDTO;
import com.example.ejercicios3.dtos.HabitacionDTO;
import com.example.ejercicios3.dtos.PriceDTO;
import com.example.ejercicios3.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CasaServiceImpl implements CasaService{

    private final PriceRepository priceRepository;

    @Autowired
    public CasaServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public DetalleCasaDTO getDetalle(CasaDTO casa) {

        Map<HabitacionDTO, Double> areasPorHabitacion = calcularAreaHabitaciones(casa);
        double areaTotal = calcularAreaTotal(areasPorHabitacion);

        return new DetalleCasaDTO(areaTotal,
                calcularValor(areaTotal, casa.getLocation()),
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

    private double calcularValor(double areaTotal, String location) {

        PriceDTO priceByLocation = priceRepository.findPriceByLocation(location);

        int price = priceByLocation != null ? priceByLocation.getPrice() : 800;

        return areaTotal * price;
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
