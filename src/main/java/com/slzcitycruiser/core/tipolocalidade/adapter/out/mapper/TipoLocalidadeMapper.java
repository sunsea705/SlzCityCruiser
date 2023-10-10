package com.slzcitycruiser.core.tipolocalidade.adapter.out.mapper;

import com.slzcitycruiser.core.tipolocalidade.adapter.out.database.entity.TipoLocalidadeEntity;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TipoLocalidadeMapper {

    public TipoLocalidade fromJpaToDomain(TipoLocalidadeEntity tipoLocalidadeEntity){
        return createModelMapper().map(tipoLocalidadeEntity, TipoLocalidade.class);
    }

    public TipoLocalidadeEntity fromDomainToJpa(TipoLocalidade tipoLocalidade){
        return createModelMapper().map(tipoLocalidade, TipoLocalidadeEntity.class);
    }

    private ModelMapper createModelMapper(){
        return new ModelMapper();
    }
}
