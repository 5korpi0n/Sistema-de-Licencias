package com.cdainfo.vacaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @SpringBootApplication(scanBasePackages={"com.cdainfo.vacaciones.controller"})
@SpringBootApplication
@ComponentScan({"com.cdainfo.vacaciones"})
@EntityScan("com.cdainfo.vacaciones.entity")
@EnableJpaRepositories("com.cdainfo.vacaciones.repository")
public class GestionDeVacacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeVacacionesApplication.class, args);
	}

}