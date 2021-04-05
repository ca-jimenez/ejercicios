package com.example.ejercicios3.services;


import com.example.ejercicios3.dtos.DishDTO;
import com.example.ejercicios3.dtos.ResponseDTO;

public interface IngredientService {

    public ResponseDTO calculateCalories(DishDTO inputDish);

}
