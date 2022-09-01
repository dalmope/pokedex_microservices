package com.example.pokedex_hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PokedexHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexHexagonalApplication.class, args);
	}

}
