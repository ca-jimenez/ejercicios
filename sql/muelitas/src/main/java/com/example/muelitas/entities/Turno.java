package com.example.muelitas.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    private Boolean disponible;

    @Column(name = "horario_entrada")
    private String horarioEntrada;

    @ManyToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private Agenda agenda;
}
