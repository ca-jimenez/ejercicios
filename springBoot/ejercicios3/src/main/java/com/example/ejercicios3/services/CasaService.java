package com.example.ejercicios3.services;

import com.example.ejercicios3.dtos.CasaDTO;
import com.example.ejercicios3.dtos.DetalleCasaDTO;

public interface CasaService {

    public DetalleCasaDTO getDetalle(CasaDTO casa);
}
