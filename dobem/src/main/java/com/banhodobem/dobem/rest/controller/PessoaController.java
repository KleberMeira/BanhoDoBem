package com.banhodobem.dobem.rest.controller;


import com.banhodobem.dobem.domain.entity.Pessoa;
import com.banhodobem.dobem.domain.repository.Pessoas;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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





}
