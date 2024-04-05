package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class ExemploDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploDockerApplication.class, args);
		System.out.println("Rota com instuções: http://localhost:8080");
	}
	@GetMapping
	public String exemploDocker() {
		return "docker build -t nome-da-imagem . \ndocker run -d --name meu-container nome-da-imagem:latest";
	}
	//como fazer:
		//Ter o .jar no projeto
		//Ter o arquivo "dockerfile" na pasta raiz do projeto
		//É importante ter exatamente esse nome "dockerfile"
	//Após essa fase pronta é preciso rodar 2 comando apenas:
		//docker build -t nome-da-imagem .
		//docker run -d --name meu-container nome-da-imagem:latest
}
