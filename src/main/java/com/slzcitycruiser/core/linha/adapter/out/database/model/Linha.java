package com.slzcitycruiser.core.linha.adapter.out.database.model;

import com.slzcitycruiser.core.localidade.adapter.out.database.model.Localidade;
import com.slzcitycruiser.core.prefixo.adapter.out.database.model.Prefixo;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity @Data
@Table(schema = "slzcitycruiser")
@SequenceGenerator(schema="slzcitycruiser", name = "seq_linha_id",
                   sequenceName = "seq_linha_id", allocationSize = 1)
public class Linha {

    @Id
    @GeneratedValue(generator = "seq_linha_id")
    private Long id;

    @ManyToOne
    private Prefixo prefixo;

    private Integer numero;

    private String nome;

    @ManyToMany
    private List<Localidade> localidades;

}
