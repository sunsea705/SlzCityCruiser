package com.slzcitycruiser.core.prefixo.application.service;

import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BuscarTodosPrefixosService implements BuscarTodosPrefixosUC {

    private PrefixoRepository prefixoRepository;

    @Override
    public List<Prefixo> execute() {
        return prefixoRepository.buscarTodosPrefixos();
    }
}
