package com.example.ejercicios3.controllers;

import com.example.ejercicios3.dtos.CasaDTO;
import com.example.ejercicios3.dtos.DetalleCasaDTO;
import com.example.ejercicios3.services.CasaService;
import com.example.ejercicios3.services.CasaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaController {

    private final CasaService casaService;

    @Autowired
    public CasaController(CasaService casaService) {
        this.casaService = casaService;
    }

    @PostMapping("/datos")
    public ResponseEntity<DetalleCasaDTO> getDatos(@RequestBody CasaDTO casa) {

        return new ResponseEntity<>(casaService.getDetalle(casa), HttpStatus.OK);
    }

}
