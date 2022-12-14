package com.jonatha.projectmidnights.service.repository;

import com.jonatha.projectmidnights.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
