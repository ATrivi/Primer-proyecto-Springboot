package com.example.Primer_proyecto_Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("entities")

public class PrimerProyectoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringbootApplication.class, args);
	}

}