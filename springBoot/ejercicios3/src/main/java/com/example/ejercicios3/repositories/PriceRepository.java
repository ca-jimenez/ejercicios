package com.example.ejercicios3.repositories;

import com.example.ejercicios3.dtos.PriceDTO;


public interface PriceRepository {

    PriceDTO findPriceByLocation(String location);
}
