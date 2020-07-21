package com.banhodobem.dobem;

import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repository.Pessoas;
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
			System.out.println("Salvando Pessoas");
			pessoas.save(new Pessoa("Kleber"));
			pessoas.save(new Pessoa("Irmã"));

			List<Pessoa> result = pessoas.encontrarPorNome("Kleber");
			result.forEach(System.out::println);



		};



	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDobemApplication.class, args);
	}

}
