package com.slzcitycruiser.core.tipolocalidade.application.service;

import com.slzcitycruiser.core.tipolocalidade.application.in.BuscarTodosTiposLocalidadeUC;
import com.slzcitycruiser.core.tipolocalidade.application.out.TipoLocalidadeRepository;
import com.slzcitycruiser.core.tipolocalidade.domain.TipoLocalidade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BuscarTodosTipoLocalidadeService implements BuscarTodosTiposLocalidadeUC {

    private TipoLocalidadeRepository tipoLocalidadeRepository;

    @Override
    public List<TipoLocalidade> execute() {
        return tipoLocalidadeRepository.buscarTodosTiposLocalidade();
    }
}
