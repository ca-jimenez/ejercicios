package com.example.ejercicios3.dtos;

import com.example.ejercicios3.entities.IngredientInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private Double totalCaloriesAmount;
    private HashMap<IngredientDTO, Double> ingredientCaloriesAmount;
    private IngredientDTO highestCaloriesIngredient;

}
