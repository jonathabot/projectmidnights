package com.jonatha.projectmidnights.controller;

import com.jonatha.projectmidnights.model.Gravadora;
import com.jonatha.projectmidnights.service.GravadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gravadora")
@CrossOrigin
public class GravadoraController {

    @Autowired
    private GravadoraService gravadoraService;

    @PostMapping("/add")
    public String add(@RequestBody Gravadora gravadora) {
        gravadoraService.saveGravadora(gravadora);
        System.out.println(gravadora);
        return "New gravadora is added";
    }

    @GetMapping("/getAll")
    public List<Gravadora> getAllGravadoras() { return gravadoraService.getAllGravadoras(); }
}
