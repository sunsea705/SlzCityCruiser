package com.slzcitycruiser.core.prefixo.adapter.in.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CriarPrefixoRequest {

    @NotNull @NotEmpty String descricao;
    @NotNull @NotEmpty String sigla;

}
