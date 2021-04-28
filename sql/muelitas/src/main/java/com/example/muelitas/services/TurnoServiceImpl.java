package com.example.muelitas.services;

import com.example.muelitas.dtos.TurnoDto;
import com.example.muelitas.entities.Paciente;
import com.example.muelitas.entities.Turno;
import com.example.muelitas.repositories.PacienteRepository;
import com.example.muelitas.repositories.TurnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoServiceImpl implements TurnoService {

    private final TurnoRepository turnoRepository;

    private final PacienteRepository pacienteRepository;

    public TurnoServiceImpl(TurnoRepository turnoRepository, PacienteRepository pacienteRepository) {
        this.turnoRepository = turnoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    @Transactional
    public void saveTurno(Turno turno) {

        turnoRepository.save(turno);
    }

    @Override
    @Transactional(readOnly = true)
    public Turno getTurnoById(Long id) {
        return null;
    }

    @Override
    public List<Turno> getAvailableTurnos() {
        return turnoRepository.findAll();
    }

    @Override
    public void reservaTurno(Long turnoId, Long pacienteId) {

        Turno turno = turnoRepository.findById(turnoId).orElse(null);
        Optional<Paciente> paciente = pacienteRepository.findById(pacienteId);

        if(paciente.isPresent()) {

            assert turno != null;
            turno.setPaciente(paciente.get());
            turno.setDisponible(false);
            turnoRepository.save(turno);
        }

    }
}
