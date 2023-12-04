package com.slzcitycruiser.core.tipolocalidade.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class TipoLocalidade {

    private Long id;
    private String descricao;

    public TipoLocalidade(String descricao) {
        this.descricao = descricao;
    }
}
