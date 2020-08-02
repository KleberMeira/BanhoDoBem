package com.banhodobem.dobem.rest.controller;


import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repository.Pessoas;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("/api/pessoas")
public class PessoaController {

    private Pessoas pessoas;

    public PessoaController(Pessoas pessoas){
        this.pessoas = pessoas;
    }

    @GetMapping("/api/pessoas/{id}")
    @ResponseBody
    public ResponseEntity getPessoaById(@PathVariable Integer id){

        Optional<Pessoa> pessoa = pessoas.findById(id);

        if (pessoa.isPresent()){
            return ResponseEntity.ok( pessoa.get() );
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/pessoas")
    @ResponseBody
    public ResponseEntity save ( @RequestBody Pessoa pessoa ){
        Pessoa pessoaSalva = pessoas.save(pessoa);
        return ResponseEntity.ok(pessoaSalva);
    }

    @DeleteMapping("/api/pessoas/{id}")
    @ResponseBody
    public ResponseEntity delete(@PathVariable Integer id){
        Optional<Pessoa> pessoa = pessoas.findById(id);

        if (pessoa.isPresent()){
            pessoas.delete(pessoa.get());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/api/pessoas/{id}")
    @ResponseBody
    public ResponseEntity update( @PathVariable Integer id,
                                  @RequestBody Pessoa pessoa){

        return pessoas
                .findById(id)
                .map( pessoaExistente ->{
                    pessoa.setId(pessoaExistente.getId());
                    pessoas.save(pessoa);
                    return ResponseEntity.noContent().build();
                } ).orElseGet(() -> ResponseEntity.notFound().build() );

    }

    @GetMapping("api/pessoas")
    public ResponseEntity find(Pessoa filtro){
        ExampleMatcher matcher = ExampleMatcher
                                 .matching()
                                 .withIgnoreCase()
                                 .withStringMatcher(
                                         ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        List<Pessoa> lista = pessoas.findAll(example);

        return ResponseEntity.ok(lista);
    }






}
