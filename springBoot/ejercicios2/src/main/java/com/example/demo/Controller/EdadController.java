package com.example.demo.Controller;

import com.example.demo.Services.EdadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edad")
public class EdadController {

    @GetMapping("/{day}/{month}/{year}")
    public int getAge(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return EdadService.convertirEdad(day, month, year);
    }
}
