package com.example.ejercicios3.controllers;


import com.example.ejercicios3.dtos.CharacterDTO;
import com.example.ejercicios3.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/starwars")
public class CharacterController {
    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/characters")
    public ResponseEntity<List<CharacterDTO>> calculateSingleDish(@RequestParam String name){
        return new ResponseEntity<>(this.characterService.searchCharacters(name), HttpStatus.OK);
    }
}
