package com.jonatha.projectmidnights.controller;

import com.jonatha.projectmidnights.model.Artista;
import com.jonatha.projectmidnights.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artista")
@CrossOrigin
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @PostMapping("/add")
    public String add(@RequestBody Artista artista) {
        artistaService.saveArtista(artista);
        System.out.println(artista);
        return "New artista added";
    }

    @GetMapping("/getAll")
    public List<Artista> getAllArtistas() {return artistaService.getAllArtistas();}
}
