package com.slzcitycruiser.config.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe de exceção personalizada para exibir quando uma busca
 * por entidade não é encontrada através de uma consulta por 1 ou
 * mais atributos, exibindo esses atributos no retorno da mensagem de erro.
 */
public class EntidadeNaoEncontradaException extends RuntimeException {

    @Getter @Setter
    private String descricaoErro;

    public EntidadeNaoEncontradaException(String nomeEntidade, List<String> campos){
        StringBuilder msg = new StringBuilder();
        msg.append("ERRO: Não foram encontradas nenhuma instância da entidade '");
        msg.append(nomeEntidade);
        if (!campos.isEmpty()) {
            msg.append("' com o(s) seguinte(s) campo(s) de busca: ");
            if (campos.size() == 1) {
                msg.append(campos.get(0));
            } else {
                msg.append(String.join(", ", campos));
            }
            msg.append(".");
        }

        this.descricaoErro = msg.toString();
    }

    public EntidadeNaoEncontradaException(String nomeEntidade, String campo) {
        StringBuilder msg = new StringBuilder();
        msg.append("ERRO: Não foram encontradas nenhuma instância da entidade '");
        msg.append(nomeEntidade);
        msg.append("' com o seguinte campo de busca: ");
        msg.append(campo);
        msg.append(".");

        this.descricaoErro = msg.toString();
    }

}
