package com.lulu.sistematarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SistemadeTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemadeTarefasApplication.class, args);
	}

}
