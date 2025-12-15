package com.mysite.backend.exception;

public class UserNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(Long id) {
        super("User with id " + id + " not found");
    }
}
