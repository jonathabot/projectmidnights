package com.jonatha.projectmidnights.service.repository;

import com.jonatha.projectmidnights.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer>{
}
