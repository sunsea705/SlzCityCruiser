package com.slzcitycruiser.core.prefixo.bean;

import com.slzcitycruiser.core.prefixo.application.in.BuscarTodosPrefixosUC;
import com.slzcitycruiser.core.prefixo.application.out.PrefixoRepository;
import com.slzcitycruiser.core.prefixo.application.service.BuscarTodosPrefixosService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrefixoBean {

    @Bean
    public BuscarTodosPrefixosUC createBuscarTodosPrefixosUC(PrefixoRepository prefixoRepository){
        return new BuscarTodosPrefixosService(prefixoRepository);
    }

}
