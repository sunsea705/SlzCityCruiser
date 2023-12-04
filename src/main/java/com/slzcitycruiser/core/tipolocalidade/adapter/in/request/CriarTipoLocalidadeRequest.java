package com.slzcitycruiser.core.tipolocalidade.adapter.in.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CriarTipoLocalidadeRequest {

    @NotNull @NotEmpty private String descricao;

}
