package com.slzcitycruiser.config.exceptions.handler;

import com.slzcitycruiser.config.exceptions.EntidadeNaoEncontradaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    public ResponseEntity<String> entidadeNaoEncontradaException(EntidadeNaoEncontradaException enee){

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(enee.getDescricaoErro());

    }
}
