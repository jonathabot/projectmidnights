package com.jonatha.projectmidnights.service;

import com.jonatha.projectmidnights.model.Gravadora;
import com.jonatha.projectmidnights.service.repository.GravadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GravadoraServiceImpl implements GravadoraService {

    @Autowired
    private GravadoraRepository gravadoraRepository;

    @Override
    public Gravadora saveGravadora(Gravadora gravadora) { return gravadoraRepository.save(gravadora); }

    @Override
    public List<Gravadora> getAllGravadoras() {
        return gravadoraRepository.findAll();
    }

}
