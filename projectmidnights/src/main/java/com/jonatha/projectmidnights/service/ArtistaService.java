package com.jonatha.projectmidnights.service;

import com.jonatha.projectmidnights.model.Artista;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArtistaService {

    public Artista saveArtista(Artista artista);

    public List<Artista> getAllArtistas();
}
