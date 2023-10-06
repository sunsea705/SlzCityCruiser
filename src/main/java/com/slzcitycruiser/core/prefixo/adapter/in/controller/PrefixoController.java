package com.slzcitycruiser.core.prefixo.adapter.in.controller;

import com.slzcitycruiser.config.exceptions.EntidadeNaoEncontradaException;
import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prefixo")
public class PrefixoController {

    private final BuscarTodosPrefixosUC buscarTodosPrefixosUC;

    @GetMapping
    public ResponseEntity<List<Prefixo>> buscarTodosPrefixos() {

        throw new EntidadeNaoEncontradaException("Prefixo", Arrays.asList("id"));

        /*
        return ResponseEntity.ok(
                    buscarTodosPrefixosUC.execute()
                );

         */
    }
}
