package com.jonatha.projectmidnights.service;

import com.jonatha.projectmidnights.model.Gravadora;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GravadoraService {
    public Gravadora saveGravadora(Gravadora gravadora);

    public List<Gravadora> getAllGravadoras();
}
