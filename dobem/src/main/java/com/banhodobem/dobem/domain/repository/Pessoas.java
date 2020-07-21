package com.banhodobem.dobem.domain.repositorio;

import com.banhodobem.dobem.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Pessoas extends JpaRepository<Pessoa, Integer> {

    @Query(value = " select * from Pessoa p where p.nome like '%:nome%'", nativeQuery = true)
    List<Pessoa> encontrarPorNome( @Param("nome") String nome);

    @Query("delete from Pessoa p where p.nome =:nome")
    @Modifying
    void deleteByNome(String nome);

    //List<Pessoa> findByNomeLikeOrderById(String nome, Integer id);

    //Pessoa findOneByCpf(String cpf);

    boolean existsByNome(String nome);




}
