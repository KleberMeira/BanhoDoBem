package com.banhodobem.dobem.rest.controller;

import com.banhodobem.dobem.domain.entity.Endereco;
import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repository.Enderecos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {


    private Enderecos repository;

    public EnderecoController(Enderecos repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Endereco save(@RequestBody Endereco endereco) {
        return repository.save(endereco);
    }

    @PutMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody Endereco endereco) {

        repository
                .findById(id)
                .map(e -> {
                    endereco.setId(e.getId());
                    repository.save(endereco);
                    return endereco;
                }).orElseThrow(() ->
                new ResponseStatusException(NOT_FOUND, "Endereco não encontrado."));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void delete(@PathVariable Integer id){
        repository
                .findById(id)
                .map(e -> {
                    repository.delete(e);
                    return Void.TYPE;
                }).orElseThrow(() ->
                new ResponseStatusException(NOT_FOUND, "Endereco não encontrado."));
    }

    @GetMapping("{id}")
    public Endereco getById(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(() ->
                new ResponseStatusException(NOT_FOUND, "Endereco não encontrado."));
    }

    @GetMapping
    public List<Endereco> find(Endereco filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return repository.findAll(example);
    }



}




