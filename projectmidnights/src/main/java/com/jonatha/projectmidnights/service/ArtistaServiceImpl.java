package com.jonatha.projectmidnights.service;

import com.jonatha.projectmidnights.model.Artista;
import com.jonatha.projectmidnights.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaServiceImpl implements ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public Artista saveArtista(Artista artista) {return artistaRepository.save(artista);}

    public List<Artista> getAllArtistas() {return artistaRepository.findAll();}
}
