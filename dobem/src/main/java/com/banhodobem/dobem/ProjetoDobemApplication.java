package com.banhodobem.dobem;

import com.banhodobem.dobem.domain.entity.Endereco;
import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repository.Enderecos;
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
	public CommandLineRunner init(
			@Autowired Pessoas pessoas,
			@Autowired Enderecos endereco
	){
		return args -> {
			System.out.println("Salvando Pessoas");
			Pessoa p1 = new Pessoa("Kleber");
			pessoas.save((p1));
			pessoas.save(new Pessoa("Joao"));
			pessoas.save(new Pessoa("Irmã"));

			Endereco e = new Endereco();
			e.setCep(456713);
			e.setBairro("Alagoas");
			e.setRua("Das Paineiras");
			e.setCodicaoMoradia("Propria");
			e.setNumero(344);
			e.setMorador(p1);

			endereco.save(e);
			System.out.println(" TUDO SALVO ");

		/*
			Pessoa pessoa = pessoas.findPessoaFetchEnderecos(p1.getId());
			//List<Pessoa> result = pessoas.encontrarPorNome("Kleber");
			System.out.println(pessoa);
			System.out.println(pessoa.getEnderecos());
			//result.forEach(System.out::println);
		 */
		//endereco.findByNomeMorador(p1).forEach(System.out::println);


		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDobemApplication.class, args);
	}

}
