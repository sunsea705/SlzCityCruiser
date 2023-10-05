package com.slzcitycruiser.core.prefixo.application.out;

import com.slzcitycruiser.core.prefixo.domain.Prefixo;

import java.util.List;

public interface PrefixoRepository {

    List<Prefixo> buscarTodosPrefixos();
}
