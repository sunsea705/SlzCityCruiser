package com.slzcitycruiser.core.linha.adapter.out.database.entity;

import com.slzcitycruiser.core.localidade.adapter.out.database.entity.LocalidadeEntity;
import com.slzcitycruiser.core.prefixo.adapter.out.database.entity.PrefixoEntity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "linha", schema = "sql10667485")
@SequenceGenerator(schema="sql10667485", name = "seq_linha_id",
                   sequenceName = "seq_linha_id", allocationSize = 1)
public class LinhaEntity {

    @Id
    @GeneratedValue(generator = "seq_linha_id")
    private Long id;

    @ManyToOne
    private PrefixoEntity prefixoEntity;

    private Integer numero;

    private String nome;

    @ManyToMany
    private List<LocalidadeEntity> localidadeEntities;

}
