package com.slzcitycruiser.prefixo;

import com.slzcitycruiser.core.prefixo.adapter.in.controller.PrefixoController;
import com.slzcitycruiser.core.prefixo.adapter.in.request.CriarPrefixoRequest;
import com.slzcitycruiser.core.prefixo.application.in.CriarPrefixoUC;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PrefixoTests {

    @InjectMocks
    private PrefixoController prefixoController;

    @Mock
    private CriarPrefixoUC criarPrefixoUC;

    @Test
    public void testCriarPrefixoComDescricaoENulaDeveRetornarBadRequest() {

        CriarPrefixoRequest request = new CriarPrefixoRequest(null, "TST");

        ResponseEntity<?> response = prefixoController.criarPrefixo(request);

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());

    }


}
