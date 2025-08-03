package com.example.Primer_proyecto_Springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.Primer_proyecto_Springboot.entities.Persona;
import com.example.Primer_proyecto_Springboot.repository.PersonaRepository;
import com.example.Primer_proyecto_Springboot.service.PersonaService;

@SpringBootApplication

public class PrimerProyectoSpringbootApplication {
	
	
	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringbootApplication.class, args);
		

	}

	/*@Override
	public void run(String... args) throws Exception {
		
		personaService.crearPersona(new Persona(5L, "Juan", 42));
		personaService.crearPersona(new Persona(6L, "Luis", 56));
		personaService.crearPersona(new Persona(7L, "Lucas", 56));
		personaService.crearPersona(new Persona(8L, "Mopa", 76));
		
		System.out.println("Numero de personas:" + personaService.contarPersonas());
		
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la persona" + p.getName()));
		
	} */

}
