package com.banhodobem.dobem.domain.repository;


import com.banhodobem.dobem.domain.entity.Endereco;
import com.banhodobem.dobem.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Enderecos extends JpaRepository<Endereco, Integer> {

    List<Pessoa> findByNomeMorador( Pessoa pessoa );


}
