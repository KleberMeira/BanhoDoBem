package com.banhodobem.dobem;

import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repository.Pessoas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetoDobemApplication {

	@Bean
	public CommandLineRunner commandLineRunner(@Autowired Pessoas pessoas){
		return args -> {
			Pessoa p = new Pessoa(null,"Kleber");
			pessoas.save(p);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDobemApplication.class, args);
	}

}
