package com.slzcitycruiser.core.prefixo.adapter.out;

import com.slzcitycruiser.core.prefixo.adapter.out.database.repository.PrefixoJpaRepository;
import com.slzcitycruiser.core.prefixo.adapter.out.mapper.PrefixoMapper;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PrefixoAdapter implements PrefixoRepository {

    private final PrefixoJpaRepository prefixoJpaRepository;

    private final PrefixoMapper prefixoMapper;

    @Override
    public List<Prefixo> buscarTodosPrefixos() {
        return prefixoJpaRepository
               .findAll()
               .stream()
               .map(prefixoMapper::fromJpaToDomain)
               .toList();
    }
}
