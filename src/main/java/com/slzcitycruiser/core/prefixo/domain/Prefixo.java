package com.slzcitycruiser.core.prefixo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Prefixo {

    private Long id;
    private String descricao;
    private String sigla;

}