package com.thirtyOneApps.exceptions;

public class RunTimeConflictException extends RuntimeException{
    public RunTimeConflictException() {
    }

    public RunTimeConflictException(String message) {
        super(message);
    }
}
