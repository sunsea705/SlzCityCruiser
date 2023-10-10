package com.slzcitycruiser.core.tipolocalidade.application.out;

import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;

public interface TipoLocalidadeRepository {

    TipoLocalidade criarTipoLocalidade(String descricao);

}
