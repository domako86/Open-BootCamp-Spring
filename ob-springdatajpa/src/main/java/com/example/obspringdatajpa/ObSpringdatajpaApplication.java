package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ObSpringdatajpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		//System.out.println("find");
		//System.out.println("El nº de coches en BD es: " + repository.count());

		//Crear y almacenar un coche en base de datos
		Coche toyota = new Coche(null,"Toyota", "Prius", 2010);
		//Coche toyota = new Coche(0l,"Toyota", "Prius", 2010);
		repository.save(toyota);

		System.out.println("El nº de coches en BD es: " + repository.count());

		// recuperar todos
		//System.out.println(repository.findAll());
	}

}
