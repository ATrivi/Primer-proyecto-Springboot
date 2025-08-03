package com.example.Primer_proyecto_Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Primer_proyecto_Springboot.entities.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
