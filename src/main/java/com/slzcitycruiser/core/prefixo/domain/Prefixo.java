package com.slzcitycruiser.core.prefixo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Prefixo {

    private Long id;
    private String descricao;
    private String sigla;

    public Prefixo(String descricao, String sigla){
        this.descricao = descricao;
        this.sigla = sigla;
    }

}