package com.example.ejercicios3.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredientDTO {
    private String name;
    private Double weight;

    @Override
    public String toString() {
        return this.name;
    }
}
