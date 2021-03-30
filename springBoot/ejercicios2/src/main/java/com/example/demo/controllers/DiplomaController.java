package com.example.demo.controllers;

import com.example.demo.dtos.AlumnoDTO;
import com.example.demo.services.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumnos")
public class DiplomaController {

    @PostMapping("/diploma")
    public ResponseEntity tramitarDiploma(@RequestBody AlumnoDTO alumno) {

        return new ResponseEntity(DiplomaService.getDiploma(alumno), HttpStatus.OK);

    }

}
