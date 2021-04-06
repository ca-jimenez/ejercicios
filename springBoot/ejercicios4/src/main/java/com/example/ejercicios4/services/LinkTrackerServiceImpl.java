package com.example.ejercicios4.services;

import com.example.ejercicios4.dtos.LinkDTO;
import com.example.ejercicios4.dtos.ResponseDTO;
import com.example.ejercicios4.repositories.LinkTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class LinkTrackerServiceImpl implements LinkTrackerService{

    @Autowired
    private LinkTrackerRepository linkTrackerRepository;

    @Override
    public ResponseDTO createLink(String url, String password) throws URISyntaxException {

        Pattern pattern = Pattern.compile("[(http(s)?)://(www.)?a-zA-Z0-9@:%._+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_+.~#?&//=]*)");
        Matcher matcher = pattern.matcher(url);
        boolean matchFound = matcher.find();

        if (matchFound) {

            return new ResponseDTO(linkTrackerRepository.addLink(url, password));
        } else {
            throw new URISyntaxException(url, "Invalid url");
        }
    }

    @Override
    public HttpHeaders redirectLink(Integer linkId, String password) throws Exception {

        String url = linkTrackerRepository.searchLink(linkId, password);
        if (url == null) {
            return null;
        }
        URI uri = new URI(url);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uri);
        return httpHeaders;
    }

    @Override
    public LinkDTO getMetrics(Integer linkId) throws Exception {
        return linkTrackerRepository.getMetrics(linkId);
    }

    @Override
    public void invalidateLink(Integer linkId) throws Exception {
        linkTrackerRepository.invalidateLink(linkId);
    }
}
