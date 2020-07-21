package com.banhodobem.dobem.domain.repositorio;

import com.banhodobem.dobem.domain.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Pessoas {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Pessoa salvar(Pessoa pessoa){
        entityManager.persist(pessoa);
        return pessoa;
    }

    @Transactional(readOnly = true)
    public List<Pessoa> obterTodos(){
        return entityManager
                .createQuery("from Pessoa", Pessoa.class)
                .getResultList();
    }

    @Transactional
    public Pessoa atualizar(Pessoa pessoa){
        entityManager.merge(pessoa);
        return pessoa;
    }

    @Transactional
    public void deletar(Pessoa pessoa){
        if(!entityManager.contains(pessoa)){
            pessoa = entityManager.merge(pessoa);
        }
        entityManager.remove(pessoa);
    }

    @Transactional
    public void deletar(Integer id){
        Pessoa pessoa = entityManager.find(Pessoa.class, id);
        deletar(pessoa);
    }

    @Transactional(readOnly = true)
    public List<Pessoa> buscarPorNome(String nome){
       String jpql = " select p from Pessoa p where p.nome like :nome  ";
       TypedQuery<Pessoa> query = entityManager.createQuery(jpql, Pessoa.class);
       query.setParameter("nome", "%" + nome + "%");
       return query.getResultList();
    }

/*
    public RowMapper<Pessoa> obterPessoaMapper(){
        return new RowMapper<Pessoa>() {
            @Override
            public Pessoa mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                return new Pessoa(id, nome);
            }
        };
    }
 */
}
