package com.smoothy.notificacao.Infrastructure;

public class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }
    public EmailException(String message, Throwable throwable){
        super(message, throwable);
    }

}

