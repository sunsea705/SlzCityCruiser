package com.slzcitycruiser.core.linha.domain;

import com.slzcitycruiser.core.localidade.domain.Localidade;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class Linha {

    private Long id;

    private Prefixo prefixo;

    private Integer numero;

    private String nome;

    private List<Localidade> localidades;

}
