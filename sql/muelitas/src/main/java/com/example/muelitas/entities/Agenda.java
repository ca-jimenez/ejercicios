package com.example.muelitas.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "agendas")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name = "profesional_id", referencedColumnName = "id")
    private Profesional profesional;

    @OneToMany(mappedBy = "agenda")
    private Set<Turno> turnos;
}
