package com.jonatha.projectmidnights.service;

import com.jonatha.projectmidnights.model.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlbumService {

    public Album saveAlbum(Album album);

    public List<Album> getAllAlbums();
}
