package com.slzcitycruiser.core.localidade.adapter.out.database.model;

import com.slzcitycruiser.core.linha.adapter.out.database.model.Linha;
import com.slzcitycruiser.core.tipolocalidade.adapter.out.database.model.TipoLocalidade;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity @Data
@Table(schema = "slzcitycruiser")
@SequenceGenerator(schema="slzcitycruiser", name = "seq_localidade_id",
                   sequenceName = "seq_localidade_id", allocationSize = 1)
public class Localidade {

    @Id
    @GeneratedValue(generator = "seq_localidade_id")
    private Long id;

    private String descricao;

    @OneToMany
    private TipoLocalidade tipoLocalidade;

    @ManyToMany
    private List<Linha> linhas;
}
