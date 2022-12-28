package com.example.obprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObPruebaApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(ObPruebaApplication.class, args);
		CocheRepo repository = context.getBean(CocheRepo.class);

		System.out.println("find");
		System.out.println("Los coches que hay en la base de datos son:"+repository.count());

		Coche coche1 = new Coche(null,"Toyota","MYT654",125.697);
		repository.save(coche1);

		System.out.println(repository.findAll());
	}
}
