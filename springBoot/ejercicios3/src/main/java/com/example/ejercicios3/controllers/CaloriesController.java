package com.example.ejercicios3.controllers;


import com.example.ejercicios3.dtos.DishDTO;
import com.example.ejercicios3.dtos.ResponseDTO;
import com.example.ejercicios3.services.IngredientService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calories")
public class CaloriesController {
    private final IngredientService ingredientService;

    @Autowired
    public CaloriesController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/calculateSingleDish")
    public ResponseEntity<ResponseDTO> calculateSingleDish(@RequestBody DishDTO dish){
        return new ResponseEntity<ResponseDTO>(this.ingredientService.calculateCalories(dish), HttpStatus.OK);
    }
}
