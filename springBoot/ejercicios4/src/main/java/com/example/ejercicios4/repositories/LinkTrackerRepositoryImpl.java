package com.example.ejercicios4.repositories;

import com.example.ejercicios4.dtos.LinkDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class LinkTrackerRepositoryImpl implements LinkTrackerRepository {

    private AtomicInteger contadorId = new AtomicInteger(1);

    private Map<Integer, LinkDTO> listURL;

    public LinkTrackerRepositoryImpl() {
        this.listURL = new HashMap<>();
    }

    @Override
    public Integer addLink(String url, String password) {

        //Validar URL
        listURL.put(contadorId.get(), new LinkDTO(url, password));
        return contadorId.getAndIncrement();
    }

    @Override
    public String searchLink(Integer linkId, String pass) throws Exception {

        LinkDTO link = listURL.get(linkId);

        String linkPass = link.getPassword();
        if (linkPass != null && !linkPass.equals(pass)) {
            return null;
        }

        if (link.isValid()) {

            listURL.get(linkId).setContador(listURL.get(linkId).getContador() + 1);
            return link.getUrl();
        } else {
            throw new Exception();
        }


    }

    @Override
    public LinkDTO getMetrics(Integer linkId) throws Exception {

        LinkDTO link = listURL.get(linkId);

        if (link != null && link.isValid()) {

            return link;
        } else {
            throw new Exception();
        }
    }

    @Override
    public void invalidateLink(Integer linkId) throws Exception {

        LinkDTO link = listURL.get(linkId);

        if (link != null) {

            listURL.get(linkId).setValid(false);

            return;
        } else {
            throw new Exception();
        }
    }
}
