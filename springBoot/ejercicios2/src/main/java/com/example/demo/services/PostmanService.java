package com.example.demo.services;

import com.example.demo.dtos.EstudianteDTO;
import com.example.demo.dtos.SimpsonDTO;
import com.example.demo.dtos.PotterDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class PostmanService {

    public static ResponseEntity buscarPersonaje(String nombre) {

        if (nombre.equals("harry")) {

            List<String> colores = new ArrayList<>();
            colores.add("Amarillo");
            colores.add("Bordo");

            List<EstudianteDTO> estudiantes = new ArrayList<>();

            estudiantes.add(new EstudianteDTO("Harry", "Potter"));
            estudiantes.add(new EstudianteDTO("Hermione", "Granger"));
            estudiantes.add(new EstudianteDTO("Ron", "Weasley"));

            PotterDTO harry = new PotterDTO("Gryffindor", colores, estudiantes);

            return new ResponseEntity(harry, HttpStatus.OK);

        } else {

            List<String> hijos = new ArrayList<>();
            hijos.add("Bart");
            hijos.add("Lisa");
            hijos.add("Maggie");

            SimpsonDTO homero = new SimpsonDTO("Homero", "Simpson", hijos, 40, true);

            return new ResponseEntity(homero, HttpStatus.OK);
        }
    }

    public static ResponseEntity mapearSimpson(SimpsonDTO personaje) {

        System.out.println("personaje = " + personaje);

        return new ResponseEntity(personaje, HttpStatus.OK);
    }

    public static ResponseEntity mapearPotter(PotterDTO personaje) {

        System.out.println("personaje = " + personaje);

        return new ResponseEntity(personaje, HttpStatus.OK);
    }
}
