package com.example.ejercicios3.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredientInfo {
    private String name;
    private Integer calories;

    public IngredientInfo() {
    }
}
