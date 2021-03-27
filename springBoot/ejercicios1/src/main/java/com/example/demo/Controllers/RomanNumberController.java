package com.example.demo.Controllers;

import com.example.demo.Entities.RomanNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roman")
public class RomanNumberController {

    @GetMapping("/convert")
    public RomanNumber convertToRoman(@RequestParam(value = "number") Integer number){
        return new RomanNumber(number);
    }
}
