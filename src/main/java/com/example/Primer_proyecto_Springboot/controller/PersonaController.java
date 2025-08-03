package com.example.Primer_proyecto_Springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Primer_proyecto_Springboot.entities.Persona;
import com.example.Primer_proyecto_Springboot.service.PersonaService;

@Controller
@RequestMapping ("/personas")
public class PersonaController {
	
	@Autowired
	
	private PersonaService personaService;
	
	
	@GetMapping
	public String listarPersonas(Model model) {
		
		List<Persona> personas = personaService.obtenerTodas();
		model.addAttribute("ListaPersonas" , personas);
		
		return "ListarTemplate"; }
	
	@GetMapping("/nueva")
	public String mostrarFormularioDeNuevaPersona(Model model){
		
		model.addAttribute("persona", new Persona());
		model.addAttribute("accion", "");
		return "formulario";
	} 
	
	@PostMapping("/nueva")
	public String guardarNuevaPersona (@ModelAttribute Persona persona) {
		
		personaService.crearPersona(persona);
		return "redirect:/personas";
	}
	}


