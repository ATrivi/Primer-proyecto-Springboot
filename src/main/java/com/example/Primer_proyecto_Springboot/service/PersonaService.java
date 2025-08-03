package com.example.Primer_proyecto_Springboot.service;

import java.util.List;

import com.example.Primer_proyecto_Springboot.entities.Persona;

public interface PersonaService {

	
	List<Persona> obtenerTodas();
	
	Persona obtenerPorId(Long id);
	
	Persona crearPersona(Persona persona);
	
	Persona actualizarPersona (Long id, Persona persona);
	
	void eliminarPersona (Long id);
	
	long contarPersonas();
	
}
