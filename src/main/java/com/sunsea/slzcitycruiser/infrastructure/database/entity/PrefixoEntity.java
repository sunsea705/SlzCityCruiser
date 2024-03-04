package com.sunsea.slzcitycruiser.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "slzcitycruiser", name = "prefixo")
@SequenceGenerator(name = "prefixo_id_seq", sequenceName = "prefixo_id_seq", allocationSize = 1)
public class PrefixoEntity {


    @Id
    @GeneratedValue(generator = "prefixo_id_seq")
    private Integer id;

    private String sigla;
    private String descricao;
}
