package com.slzcitycruiser.core.tipolocalidade.adapter.in.controller;

import com.slzcitycruiser.core.tipolocalidade.adapter.in.request.CriarTipoLocalidadeRequest;
import com.slzcitycruiser.core.tipolocalidade.application.in.BuscarTodosTiposLocalidadeUC;
import com.slzcitycruiser.core.tipolocalidade.application.in.CriarTipoLocalidadeUC;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipolocalidade")
@RequiredArgsConstructor
public class TipoLocalidadeController {

    private final CriarTipoLocalidadeUC criarTipoLocalidadeUC;
    private final BuscarTodosTiposLocalidadeUC buscarTodosTiposLocalidadeUC;

    @PostMapping("/criar")
    public ResponseEntity<TipoLocalidade> criarTipoLocalidade(@Valid @RequestBody CriarTipoLocalidadeRequest criarTipoLocalidadeRequest){
        return ResponseEntity.ok(
            criarTipoLocalidadeUC.execute(criarTipoLocalidadeRequest.getDescricao())
        );
    }

    @GetMapping
    public ResponseEntity<List<TipoLocalidade>> buscarTodosTiposLocalidade(){
        return ResponseEntity.ok(
            buscarTodosTiposLocalidadeUC.execute()
        );
    }


}