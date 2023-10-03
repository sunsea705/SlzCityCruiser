package com.slzcitycruiser.core.prefixo.adapter.out.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity @Data
public class Prefixo {

    @Id
    private Long id;
    private String descricao;
    private String sigla;

}
