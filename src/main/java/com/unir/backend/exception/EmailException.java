package com.unir.backend.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailException extends RuntimeException{

    public EmailException(String message){
        super(message);
    }

}
