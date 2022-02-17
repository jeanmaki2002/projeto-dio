package com.api.estacionamento.de.carro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EstacionamentoDeCarroApplication
{

	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoDeCarroApplication.class, args);
	}
  @GetMapping("/")
	public String index(){
		return "olá mundo";
  					}
}
