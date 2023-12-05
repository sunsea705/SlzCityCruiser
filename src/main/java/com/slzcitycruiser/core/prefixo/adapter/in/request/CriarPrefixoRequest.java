package com.slzcitycruiser.core.prefixo.adapter.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CriarPrefixoRequest {

    private String descricao;
    private String sigla;

}
