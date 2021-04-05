package com.example.ejercicios3.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PriceDTO {

    private String location;
    private Integer price;
}
