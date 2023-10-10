package com.slzcitycruiser.core.tipolocalidade.bean;

import com.slzcitycruiser.core.tipolocalidade.application.in.CriarTipoLocalidadeUC;
import com.slzcitycruiser.core.tipolocalidade.application.out.TipoLocalidadeRepository;
import com.slzcitycruiser.core.tipolocalidade.application.service.CriarTipoLocalidadeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TipoLocalidadeBean {

    @Bean
    public CriarTipoLocalidadeUC createCriarTipoLocalidadeUC(TipoLocalidadeRepository tipoLocalidadeRepository){
        return new CriarTipoLocalidadeService(tipoLocalidadeRepository);
    }

}
