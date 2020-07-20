package com.banhodobem.dobem.domain.repositorio;

import com.banhodobem.dobem.domain.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Pessoas {

    private static String INSERT = " insert into pessoa (nome) values (?) ";

    private static String SELECT_ALL = " SELECT * FROM PESSOA ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Pessoa salvar(Pessoa pessoa){
        jdbcTemplate.update( INSERT, new Object[]{pessoa.getNome()});
        return pessoa;
    }

    public List<Pessoa>obeterTodos(){
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Pessoa>() {
            @Override
            public Pessoa mapRow(ResultSet resultSet, int i) throws SQLException {

                Integer id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");

                return new Pessoa(id, nome);
            }
        });
    }

}
