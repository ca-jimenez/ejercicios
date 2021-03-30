package com.example.demo.controllers;

import com.example.demo.dtos.PotterDTO;
import com.example.demo.dtos.SimpsonDTO;
import com.example.demo.services.PostmanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/personajes")
public class PostmanController {

    @GetMapping("/{nombre}")
    public ResponseEntity getCharacter(@PathVariable String nombre) {

        return new ResponseEntity(PostmanService.buscarPersonaje(nombre), HttpStatus.OK);
    }

    @PostMapping("/homero")
    public ResponseEntity enviarSimpson(@RequestBody SimpsonDTO personaje, @RequestHeader String pass) {

        System.out.println("pass = " + pass);
        return new ResponseEntity(PostmanService.mapearSimpson(personaje), HttpStatus.OK);
    }

    @PostMapping("/harry")
    public ResponseEntity enviarHarry(@RequestBody PotterDTO personaje, @RequestHeader Map<String, String> headers) {

        headers.forEach((key, value) -> {
            System.out.println(String.format("Parametros '%s' : '%s'", key, value));
        });

        String pass = headers.get("pass");

        return new ResponseEntity(PostmanService.mapearPotter(personaje), HttpStatus.OK);
    }
}
