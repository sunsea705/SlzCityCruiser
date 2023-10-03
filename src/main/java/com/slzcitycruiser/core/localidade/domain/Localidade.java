package com.slzcitycruiser.core.localidade.domain;

import com.slzcitycruiser.core.linha.domain.Linha;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class Localidade {

    private Long id;
    private String descricao;
    private TipoLocalidade tipoLocalidade;
    private List<Linha> linhas;

}
