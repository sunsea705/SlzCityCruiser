package com.slzcitycruiser.core.prefixo.bean;

import com.slzcitycruiser.core.prefixo.application.in.BuscarPrefixoPorIdUC;
import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.application.in.CriarPrefixoUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.application.service.BuscarPrefixoPorIdService;
import com.slzcitycruiser.core.prefixo.application.service.BuscarTodosPrefixosService;
import com.slzcitycruiser.core.prefixo.application.service.CriarPrefixoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrefixoBean {

    @Bean
    public BuscarTodosPrefixosUC createBuscarTodosPrefixosUC(PrefixoRepository prefixoRepository){
        return new BuscarTodosPrefixosService(prefixoRepository);
    }

    @Bean
    public BuscarPrefixoPorIdUC createBuscarPrefixoPorIdUC(PrefixoRepository prefixoRepository) {
        return new BuscarPrefixoPorIdService(prefixoRepository);
    }

    @Bean
    public CriarPrefixoUC createCriarPrefixoUC(PrefixoRepository prefixoRepository) {
        return new CriarPrefixoService(prefixoRepository);
    }

}
