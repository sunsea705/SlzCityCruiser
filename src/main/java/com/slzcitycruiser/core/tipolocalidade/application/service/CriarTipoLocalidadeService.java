package com.slzcitycruiser.core.tipolocalidade.application.service;

import com.slzcitycruiser.core.tipolocalidade.application.in.CriarTipoLocalidadeUC;
import com.slzcitycruiser.core.tipolocalidade.application.out.TipoLocalidadeRepository;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CriarTipoLocalidadeService implements CriarTipoLocalidadeUC {

    private TipoLocalidadeRepository tipoLocalidadeRepository;
    @Override
    public TipoLocalidade execute(String descricao) {
        return tipoLocalidadeRepository.criarTipoLocalidade(descricao);
    }
}
