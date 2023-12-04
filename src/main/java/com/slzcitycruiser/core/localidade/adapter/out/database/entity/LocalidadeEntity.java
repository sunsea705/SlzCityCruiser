package com.slzcitycruiser.core.localidade.adapter.out.database.entity;

import com.slzcitycruiser.core.linha.adapter.out.database.entity.LinhaEntity;
import com.slzcitycruiser.core.tipolocalidade.adapter.out.database.entity.TipoLocalidadeEntity;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity @Data
@Table(name = "localidade", schema = "sql10667485")
@SequenceGenerator(schema="sql10667485", name = "seq_localidade_id",
                   sequenceName = "seq_localidade_id", allocationSize = 1)
public class LocalidadeEntity {

    @Id
    @GeneratedValue(generator = "seq_localidade_id")
    private Long id;

    private String descricao;

    @ManyToOne
    private TipoLocalidadeEntity tipoLocalidadeEntity;

    @ManyToMany
    private List<LinhaEntity> linhaEntities;
}
