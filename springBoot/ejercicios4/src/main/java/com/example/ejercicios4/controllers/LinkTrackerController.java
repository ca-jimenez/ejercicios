package com.example.ejercicios4.controllers;

import com.example.ejercicios4.dtos.ErrorDTO;
import com.example.ejercicios4.dtos.LinkDTO;
import com.example.ejercicios4.dtos.ResponseDTO;
import com.example.ejercicios4.services.LinkTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
public class LinkTrackerController {

    @Autowired
    private LinkTrackerService linkTrackerService;

    //instanciar un LinkDTO y agregarlo al Hashmap. Validar URL
    @PostMapping("/")
    public ResponseEntity<ResponseDTO> createLink(@RequestBody LinkDTO url) throws Exception {

        return new ResponseEntity<>(linkTrackerService.createLink(url.getUrl(), url.getPassword()), HttpStatus.OK);
    }

    //Buscar en el hashmap y validar el status el link y hacer toda la logica de redireccion y aumentar el contador
    @GetMapping("/link/{linkId}")
    public ResponseEntity<HttpHeaders> redirectLink(@PathVariable Integer linkId, @RequestParam(required = false) String password) throws Exception {
        HttpHeaders headers = linkTrackerService.redirectLink(linkId, password);

        if (headers == null) {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        } else {

            return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
        }
    }

    //Buscar en el hashmap y devolver el contador
    @GetMapping("/metrics/{linkId}")
    public ResponseEntity<LinkDTO> getMetrics(@PathVariable Integer linkId) throws Exception {

        return new ResponseEntity<>(linkTrackerService.getMetrics(linkId), HttpStatus.OK);
    }

    //Buscar en el hashmap y cambiar el status del link
    @PostMapping("/invalidate/{linkId}")
    public ResponseEntity invalidateLink(@PathVariable Integer linkId) throws Exception {
        linkTrackerService.invalidateLink(linkId);
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(value={URISyntaxException.class})
    public ResponseEntity<ErrorDTO> InvalidURLException(Exception e){
        ErrorDTO errorDTO = new ErrorDTO("Invalid URL", e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value={Exception.class})
    public ResponseEntity<ErrorDTO> LinkNotFoundException(Exception e){
        ErrorDTO errorDTO = new ErrorDTO("Invalid Link", "Link not found");
        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }
    

}
