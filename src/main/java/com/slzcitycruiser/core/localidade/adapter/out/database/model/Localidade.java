package com.slzcitycruiser.core.localidade.adapter.out.database.model;

import com.slzcitycruiser.core.linha.adapter.out.database.model.Linha;
import com.slzcitycruiser.core.tipolocalidade.adapter.out.database.model.TipoLocalidade;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity @Data
public class Localidade {

    @Id
    private Long id;

    private String descricao;

    @OneToMany
    private TipoLocalidade tipoLocalidade;

    @ManyToMany
    private List<Linha> linhas;
}
