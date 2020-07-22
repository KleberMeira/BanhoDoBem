package com.banhodobem.dobem.domain.repository;

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

    boolean existsByNome(String nome);

    @Query(" select p from Pessoa p left join fetch p.enderecos where p.id = :id")
    Pessoa findPessoaFetchEnderecos(@Param("id") Integer id);






}
