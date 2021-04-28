package com.example.muelitas.services;

import com.example.muelitas.entities.Paciente;
import com.example.muelitas.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    @Override
    public void savePaciente(Paciente paciente) {

    }
}
