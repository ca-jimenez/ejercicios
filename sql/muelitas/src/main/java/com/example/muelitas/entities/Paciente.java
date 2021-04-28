package com.example.muelitas.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String lastname;
    private String dni;


    @OneToOne(mappedBy = "paciente")
    private Turno turno;
}
