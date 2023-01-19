package com.unir.backend.exception;

import com.unir.backend.models.response.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@ControllerAdvice
public class HandlerException {

    //Excepcion personalizada del correo.
    @ExceptionHandler(value = EmailException.class)
    public ResponseEntity<Object> handlerEmailExc(EmailException ex, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), LocalDate.now());
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //Las demas excepciones
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handlerExc(Exception ex, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), LocalDate.now());
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
