package com.slzcitycruiser.config.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Classe de exceção personalizada para exibir quando há falha na criação
 * de uma entidade, seja por falta de parâmetros ou dados incorretos para
 * os valores destes parâmetros.
 */
public class ParametrosParaCriacaoInvalidosException extends RuntimeException {

    @Getter @Setter
    private String descricaoErro;

    public ParametrosParaCriacaoInvalidosException(String nomeEntidade, List<String> parametrosInvalidos){
        StringBuilder msg = new StringBuilder();
        msg.append("ERRO: Um ou mais parâmetros para a criação da entidade '");
        msg.append(nomeEntidade);
        msg.append("' não foram fornecidos ou foram fornecidos incorretamente: ");
        if (!parametrosInvalidos.isEmpty()) {
            if (parametrosInvalidos.size() == 1) {
                msg.append(parametrosInvalidos.get(0));
            } else {
                msg.append(String.join(", ", parametrosInvalidos));
            }
            msg.append(".");
        }

        this.descricaoErro = msg.toString();
    }


}
