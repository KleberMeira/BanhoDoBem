package com.banhodobem.dobem;

import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repositorio.Pessoas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProjetoDobemApplication {

	@Bean
	public CommandLineRunner init(@Autowired Pessoas pessoas){
		return args -> {
			pessoas.salvar(new Pessoa("Kleber"));
			pessoas.salvar(new Pessoa("Irmã"));

			List<Pessoa> todasPessoas = pessoas.obeterTodos();
			todasPessoas.forEach(System.out::println);
		};

	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDobemApplication.class, args);
	}

}
