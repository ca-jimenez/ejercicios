package com.example.ejercicios3.services;

import com.example.ejercicios3.dtos.CharacterDTO;
import com.example.ejercicios3.repositories.CharacterRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Data
public class CharacterServiceImp implements CharacterService {
    private CharacterRepository characterRepo;

    @Autowired
    public CharacterServiceImp(CharacterRepository characterRepo) {
        this.characterRepo = characterRepo;
    }

    @Override
    public List<CharacterDTO> searchCharacters(String name) {
//        HashMap<IngredientDTO,Double> calculatedList= calculateIngredientList(inputDish.getIngredients());
//        IngredientDTO highestIngredient = highestCaloriesIngredient(calculatedList);
//        Double calorieCount = totalCalories(calculatedList);
//
        return findCharactersByName(name);
    }

    private List<CharacterDTO> findCharactersByName(String name) {
//    private HashMap<IngredientDTO,Double> calculateIngredientList(List<IngredientDTO> ingredients){
        List<CharacterDTO> characterList = characterRepo.getCharacters();
        List<CharacterDTO> result = characterList
                .stream()
                .filter(character -> character.getName().toUpperCase()
                        .contains(name.toUpperCase()))
                .collect(Collectors.toList());
//                    .findAny()
//                    .orElse(null);
//            assert match != null;
//            result.put(ingredient, ingredient.getWeight()*match.getCalories() );
//        }
        return result;
    }

//    private IngredientDTO highestCaloriesIngredient(HashMap<IngredientDTO,Double> ingredientList){
//        IngredientDTO max = new IngredientDTO("",0.0);
//        Double maxCal =0.0;
//        for (Map.Entry<IngredientDTO, Double> entry : ingredientList.entrySet()) {
//            if (entry.getValue()> maxCal) {
//                max=entry.getKey();
//                maxCal=entry.getValue();
//            }
//        }
//        return max;
//    }
//
//    private Double totalCalories(HashMap<IngredientDTO,Double> ingredientList){
//        Double count =0.0;
//        for (Map.Entry<IngredientDTO, Double> entry : ingredientList.entrySet()) {
//            count+= entry.getValue();
//        }
//        return count;
//    }


}
