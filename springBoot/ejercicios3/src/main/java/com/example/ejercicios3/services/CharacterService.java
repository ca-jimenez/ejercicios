package com.example.ejercicios3.services;


import com.example.ejercicios3.dtos.CharacterDTO;

import java.util.List;

public interface CharacterService {

    public List<CharacterDTO> searchCharacters(String name);

}
