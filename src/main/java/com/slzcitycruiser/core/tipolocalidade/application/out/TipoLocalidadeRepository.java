package com.slzcitycruiser.core.tipolocalidade.application.out;

import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;

import java.util.List;

public interface TipoLocalidadeRepository {

    TipoLocalidade criarTipoLocalidade(String descricao);

    List<TipoLocalidade> buscarTodosTiposLocalidade();

}
