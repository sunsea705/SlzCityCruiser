package com.slzcitycruiser.core.prefixo.adapter.out.database.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity @Data
@Table(name = "prefixo", schema = "sql10667485")
@SequenceGenerator(schema="sql10667485", name = "seq_prefixo_id",
                   sequenceName = "seq_prefixo_id", allocationSize = 1)
public class PrefixoEntity {

    @Id
    @GeneratedValue(generator = "seq_prefixo_id")
    private Long id;
    private String descricao;
    private String sigla;

}
