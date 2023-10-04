package com.slzcitycruiser.core.prefixo.adapter.out.database.model;

import javax.persistence.*;

import lombok.Data;

@Entity @Data
@Table(schema = "slzcitycruiser")
@SequenceGenerator(schema="slzcitycruiser", name = "seq_prefixo_id",
                   sequenceName = "seq_prefixo_id", allocationSize = 1)
public class Prefixo {

    @Id
    @GeneratedValue(generator = "seq_prefixo_id")
    private Long id;
    private String descricao;
    private String sigla;

}
