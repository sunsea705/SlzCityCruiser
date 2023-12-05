package com.slzcitycruiser.core.prefixo.application.service;

import com.slzcitycruiser.core.prefixo.application.in.BuscarPrefixoPorIdUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarPrefixoPorIdService implements BuscarPrefixoPorIdUC {

    private PrefixoRepository prefixoRepository;

    @Override
    public Prefixo execute(Long id) {
        return prefixoRepository.buscarPrefixoPorId(id);
    }
}
