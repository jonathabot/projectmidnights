package com.jonatha.projectmidnights.controller;

import com.jonatha.projectmidnights.model.Album;
import com.jonatha.projectmidnights.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
@CrossOrigin
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/add")
    public String add(@RequestBody Album album) {
        albumService.saveAlbum(album);
        System.out.println(album);
        return "New album added";
    }

    @GetMapping("/getAll")
    public List<Album> getAllAlbums() {return albumService.getAllAlbums();}
}
