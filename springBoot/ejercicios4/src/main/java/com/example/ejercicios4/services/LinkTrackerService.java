package com.example.ejercicios4.services;

import com.example.ejercicios4.dtos.LinkDTO;
import com.example.ejercicios4.dtos.ResponseDTO;
import org.springframework.http.HttpHeaders;

public interface LinkTrackerService {

    ResponseDTO createLink (String url, String password) throws Exception;
    HttpHeaders redirectLink (Integer linkId, String password) throws Exception;
    LinkDTO getMetrics(Integer linkId) throws Exception;

    void invalidateLink(Integer linkId) throws Exception;
}
