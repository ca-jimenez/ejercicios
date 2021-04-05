package com.example.ejercicios3.repositories;

import com.example.ejercicios3.dtos.CharacterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.List;

@Repository
public class CharacterRepositoryImp implements CharacterRepository{

    private List<CharacterDTO> charactersDb = null;

    @Override
    public List<CharacterDTO> getCharacters() {

        if (charactersDb == null) {

            charactersDb = loadDataBase();
        }

        return charactersDb;
    }

    private List<CharacterDTO> loadDataBase() {
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:starwars.json");

        } catch (Exception e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        TypeReference<List<CharacterDTO>> typeRef = new TypeReference<>() {};

        List<CharacterDTO> characterList = null;

        try {
            characterList = objectMapper.readValue(file, typeRef);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return characterList;
    }
}
