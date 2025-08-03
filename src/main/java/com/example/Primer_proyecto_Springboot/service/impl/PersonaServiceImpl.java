package com.example.Primer_proyecto_Springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Primer_proyecto_Springboot.entities.Persona;
import com.example.Primer_proyecto_Springboot.repository.PersonaRepository;
import com.example.Primer_proyecto_Springboot.service.PersonaService;



@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> obtenerTodas() {
		
		return personaRepository.findAll();
	}

	@Override
	public Persona obtenerPorId(Long id) {

		return personaRepository.findById(id).orElse(null);
	}

	@Override
	public Persona crearPersona(Persona persona) {

		return personaRepository.save(persona);
	}

	@Override
	public Persona actualizarPersona(Long id, Persona persona) {

		Persona personaBBDD = personaRepository.findById(id).orElse(persona);

		if (personaBBDD != null) {

			personaBBDD.setName(persona.getName());
			personaBBDD.setEdad(persona.getEdad());
			
			return personaRepository.save(personaBBDD);
		}
	
	return null; }

	@Override
	public void eliminarPersona(Long id) {
		
		personaRepository.deleteById(id);

		
	}

	@Override
	public long contarPersonas() {
		
		return personaRepository.count();
	}

}
