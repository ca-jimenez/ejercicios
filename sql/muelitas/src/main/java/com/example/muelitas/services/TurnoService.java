package com.example.muelitas.services;

import com.example.muelitas.dtos.TurnoDto;
import com.example.muelitas.entities.Turno;

import java.util.List;

public interface TurnoService {

    void saveTurno(Turno turno);

    Turno getTurnoById(Long id);

    List<Turno> getAvailableTurnos();

    void reservaTurno(Long turnoId, Long pacienteId);

}
