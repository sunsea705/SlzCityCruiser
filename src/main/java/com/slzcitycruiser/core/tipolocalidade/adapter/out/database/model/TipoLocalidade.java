package com.slzcitycruiser.core.tipolocalidade.adapter.out.database.model;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
@Table(name = "tipo_localidade", schema = "slzcitycruiser")
@SequenceGenerator(schema="slzcitycruiser", name = "seq_tipo_localidade_id",
                   sequenceName = "seq_tipo_localidade_id", allocationSize = 1)
public class TipoLocalidade {

    @Id
    @GeneratedValue(generator = "seq_tipo_localidade_id")
    private Long id;

    private String descricao;
}
