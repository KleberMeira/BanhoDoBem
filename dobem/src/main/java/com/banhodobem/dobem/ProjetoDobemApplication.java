package com.banhodobem.dobem;

import com.banhodobem.dobem.domain.entity.Endereco;
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

			Endereco e = new Endereco();
			e.setCep(456713);
			e.setBairro("Alagoas");
			e.setRua("Das Paineiras");
			e.setCodicaoMoradia("Propria");
			e.setNumero(344);
			e.se

			List<Pessoa> result = pessoas.encontrarPorNome("Kleber");
			result.forEach(System.out::println);



		};



	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDobemApplication.class, args);
	}

}
