package com.esprit.clinique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages= {"com.esprit.clinique.controller"})
public class CliniqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliniqueApplication.class, args);
	}

}
