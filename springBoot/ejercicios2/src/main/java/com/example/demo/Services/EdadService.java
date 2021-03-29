package com.example.demo.Services;

import java.time.LocalDate;
import java.time.Period;

public class EdadService {

    public static int convertirEdad(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        Period period = Period.between(date, LocalDate.now());

        return period.getYears();
    }
}
