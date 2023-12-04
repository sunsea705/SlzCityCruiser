package com.slzcitycruiser.core.tipolocalidade.adapter.in.controller;

import com.slzcitycruiser.core.tipolocalidade.adapter.in.request.CriarTipoLocalidadeRequest;
import com.slzcitycruiser.core.tipolocalidade.application.in.CriarTipoLocalidadeUC;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipolocalidade")
@RequiredArgsConstructor
public class TipoLocalidadeController {

    private final CriarTipoLocalidadeUC criarTipoLocalidadeUC;

    @PostMapping("/criar")
    public ResponseEntity<TipoLocalidade> criarTipoLocalidade(@Valid @RequestBody CriarTipoLocalidadeRequest criarTipoLocalidadeRequest){
        return ResponseEntity.ok(
            criarTipoLocalidadeUC.execute(criarTipoLocalidadeRequest.getDescricao())
        );
    }




}
