package com.slzcitycruiser.core.prefixo.adapter.in.controller;

import com.slzcitycruiser.core.prefixo.application.in.BuscarPrefixoPorIdUC;
import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("prefixo")
public class PrefixoController {

    private final BuscarTodosPrefixosUC buscarTodosPrefixosUC;
    private final BuscarPrefixoPorIdUC buscarPrefixoPorIdUC;

    @GetMapping
    public ResponseEntity<List<Prefixo>> buscarTodosPrefixos() {
        return ResponseEntity.ok(buscarTodosPrefixosUC.execute());
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<Prefixo> buscarPrefixoPorId(@Valid @PathVariable Long id) {
        return ResponseEntity.ok(buscarPrefixoPorIdUC.execute(id));
    }
}
