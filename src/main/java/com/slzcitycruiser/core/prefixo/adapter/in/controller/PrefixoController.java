package com.slzcitycruiser.core.prefixo.adapter.in.controller;

import com.slzcitycruiser.core.prefixo.adapter.in.request.CriarPrefixoRequest;
import com.slzcitycruiser.core.prefixo.application.in.BuscarPrefixoPorIdUC;
import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.application.in.CriarPrefixoUC;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Prefixo")
@RequestMapping("/prefixo")
public class PrefixoController {

    private final BuscarTodosPrefixosUC buscarTodosPrefixosUC;
    private final BuscarPrefixoPorIdUC buscarPrefixoPorIdUC;
    private final CriarPrefixoUC criarPrefixoUC;

    @GetMapping
    public ResponseEntity<List<Prefixo>> buscarTodosPrefixos() {
        return ResponseEntity.ok(buscarTodosPrefixosUC.execute());
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<Prefixo> buscarPrefixoPorId(@Valid @PathVariable Long id) {
        return ResponseEntity.ok(buscarPrefixoPorIdUC.execute(id));
    }

    @PostMapping("/criar")
    public ResponseEntity<Prefixo> criarPrefixo(@RequestBody CriarPrefixoRequest criarPrefixoRequest) {
        return ResponseEntity.ok(criarPrefixoUC.execute(criarPrefixoRequest.getDescricao(), criarPrefixoRequest.getSigla()));
    }
}
