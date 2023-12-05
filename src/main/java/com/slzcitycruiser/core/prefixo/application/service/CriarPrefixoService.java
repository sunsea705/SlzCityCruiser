package com.slzcitycruiser.core.prefixo.application.service;

import com.slzcitycruiser.config.exceptions.ParametrosParaCriacaoInvalidosException;
import com.slzcitycruiser.core.prefixo.application.in.CriarPrefixoUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class CriarPrefixoService implements CriarPrefixoUC {

    private PrefixoRepository prefixoRepository;

    @Override
    public Prefixo execute(String descricao, String sigla) {

        if (descricao == null || descricao.isEmpty()){
            throw new ParametrosParaCriacaoInvalidosException("Prefixo", Arrays.asList("Descrição"));
        }

        return prefixoRepository.criarPrefixo(descricao, sigla);
    }
}
