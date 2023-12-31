package com.slzcitycruiser.core.tipolocalidade.adapter.out;

import com.slzcitycruiser.core.tipolocalidade.adapter.out.database.repository.TipoLocalidadeJpaRepository;
import com.slzcitycruiser.core.tipolocalidade.adapter.out.mapper.TipoLocalidadeMapper;
import com.slzcitycruiser.core.tipolocalidade.application.out.TipoLocalidadeRepository;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TipoLocalidadeAdapter implements TipoLocalidadeRepository {

    private final TipoLocalidadeJpaRepository tipoLocalidadeJpaRepository;
    private final TipoLocalidadeMapper tipoLocalidadeMapper;

    @Override
    public TipoLocalidade criarTipoLocalidade(String descricao) {

        return
            tipoLocalidadeMapper.fromJpaToDomain(
                tipoLocalidadeJpaRepository.save(
                    tipoLocalidadeMapper.fromDomainToJpa(new TipoLocalidade(descricao))
                )
            );

    }

    @Override
    public List<TipoLocalidade> buscarTodosTiposLocalidade() {

        return tipoLocalidadeJpaRepository
                .findAll()
                .stream()
                .map(tipoLocalidadeMapper::fromJpaToDomain)
                .toList();

    }
}
