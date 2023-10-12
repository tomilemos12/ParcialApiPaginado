package com.utn.utnApiRest;

import com.utn.utnApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestPaginad {
	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiRestPaginad.class, args);
		System.out.println("--- Estoy Funcionando ---");
	}
}
