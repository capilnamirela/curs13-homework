package org.fasttrackit;

public class NoAuthorWithThatNameException extends RuntimeException{
    public NoAuthorWithThatNameException(String message){
        super(message);
    }
}
