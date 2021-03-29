package com.example.demo.Controller;

import com.example.demo.DTOs.CasaDTO;
import com.example.demo.DTOs.DetalleCasaDTO;
import com.example.demo.Services.CasaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaController {

    @PostMapping("/datos")
    public ResponseEntity getDatos(@RequestBody CasaDTO casa) {
        DetalleCasaDTO detalle = CasaService.getDetalle(casa);
        return new ResponseEntity(detalle, HttpStatus.OK);
    }

}
