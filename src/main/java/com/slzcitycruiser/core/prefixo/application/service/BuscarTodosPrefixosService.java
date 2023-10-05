package com.slzcitycruiser.core.prefixo.application.service;

import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BuscarTodosPrefixosService implements BuscarTodosPrefixosUC {

    private PrefixoRepository prefixoRepository;

    @Override
    public List<Prefixo> execute() {
        return prefixoRepository.buscarTodosPrefixos();
    }
}
