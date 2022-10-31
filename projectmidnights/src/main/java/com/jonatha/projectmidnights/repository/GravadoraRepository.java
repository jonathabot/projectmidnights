package com.jonatha.projectmidnights.repository;

import com.jonatha.projectmidnights.model.Gravadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GravadoraRepository extends JpaRepository<Gravadora, Integer> {
}
