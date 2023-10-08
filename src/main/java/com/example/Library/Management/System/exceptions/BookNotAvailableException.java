package com.example.Library.Management.System.exceptions;

public class BookNotAvailableException extends RuntimeException{

    public BookNotAvailableException(String message){
        super(message);
    }
}
