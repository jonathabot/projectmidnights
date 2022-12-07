package com.jonatha.projectmidnights.service;

import com.jonatha.projectmidnights.model.Album;
import com.jonatha.projectmidnights.service.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public Album saveAlbum(Album album) {return albumRepository.save(album);}

    public List<Album> getAllAlbums() {return albumRepository.findAll();}
}
