package com.slzcitycruiser.core.prefixo.application.service;

import com.slzcitycruiser.core.prefixo.application.in.CriarPrefixoUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CriarPrefixoService implements CriarPrefixoUC {

    private PrefixoRepository prefixoRepository;

    @Override
    public Prefixo execute(String descricao, String sigla) {
        return prefixoRepository.criarPrefixo(descricao, sigla);
    }
}
