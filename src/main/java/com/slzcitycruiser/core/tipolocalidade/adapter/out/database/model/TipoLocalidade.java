package com.slzcitycruiser.core.tipolocalidade.adapter.out.database.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data
public class TipoLocalidade {

    @Id
    private Long id;

    private String descricao;
}
