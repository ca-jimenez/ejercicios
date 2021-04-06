package com.example.ejercicios4.repositories;


import com.example.ejercicios4.dtos.LinkDTO;

public interface LinkTrackerRepository {

    Integer addLink(String url, String password);
    String searchLink(Integer linkId, String pass) throws Exception;
    LinkDTO getMetrics(Integer linkId) throws Exception;
    void invalidateLink(Integer linkId) throws Exception;
}
