package com.kyddaniel.app;

import com.kyddaniel.app.model.Alien;
import com.kyddaniel.app.model.Laptop;
import com.kyddaniel.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);

		Alien alien = context.getBean(Alien.class);
		System.out.println(alien.getAge());
		alien.code();
	}

}
