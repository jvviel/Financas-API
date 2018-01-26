package com.estudos.rest.financas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.estudos.rest.financas.config.property.FinancasProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinancasProperty.class)
public class FinancasApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancasApplication.class, args);
	}
	
}
