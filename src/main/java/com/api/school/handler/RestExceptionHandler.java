package com.api.school.handler;

import com.api.school.awesome.error.ResourceNotFoundDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.lang.module.ResolutionException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResolutionException.class)
    public ResponseEntity handlerResourceNotFoundException(ResolutionException exception){
        ResourceNotFoundDetails details = new ResourceNotFoundDetails("Resource not found",
                HttpStatus.NOT_FOUND.value(), exception.getMessage(),
                new Date().getTime(), exception.getClass().getName());

        return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
    }
}
