package com.slzcitycruiser.core.prefixo.application.in;

import com.slzcitycruiser.core.prefixo.domain.Prefixo;

public interface CriarPrefixoUC {

    Prefixo execute(String descricao, String sigla);

}
