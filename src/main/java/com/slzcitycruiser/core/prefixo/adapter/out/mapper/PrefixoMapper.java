package com.slzcitycruiser.core.prefixo.adapter.out.mapper;

import com.slzcitycruiser.core.prefixo.adapter.out.database.entity.PrefixoEntity;
import com.slzcitycruiser.core.prefixo.domain.Prefixo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PrefixoMapper {

    public Prefixo fromJpaToDomain(PrefixoEntity prefixoEntity){
        return createModelMapper().map(prefixoEntity, Prefixo.class);
    }

    public PrefixoEntity fromDomainToJpa(Prefixo prefixo) {
        return createModelMapper().map(prefixo, PrefixoEntity.class);
    }

    private ModelMapper createModelMapper() {
        return new ModelMapper();
    }

}
