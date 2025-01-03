package com.pratham.user.service.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super("Resource is not found in the database");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
