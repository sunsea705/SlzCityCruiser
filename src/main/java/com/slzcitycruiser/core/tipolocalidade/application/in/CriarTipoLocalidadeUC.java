package com.slzcitycruiser.core.tipolocalidade.application.in;

import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;

public interface CriarTipoLocalidadeUC {

    TipoLocalidade execute(String descricao);
}
