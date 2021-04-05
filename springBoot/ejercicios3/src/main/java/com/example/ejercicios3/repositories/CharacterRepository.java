package com.example.ejercicios3.repositories;

import com.example.ejercicios3.dtos.CharacterDTO;


import java.util.List;


public interface CharacterRepository {

    public List<CharacterDTO> getCharacters();
}
