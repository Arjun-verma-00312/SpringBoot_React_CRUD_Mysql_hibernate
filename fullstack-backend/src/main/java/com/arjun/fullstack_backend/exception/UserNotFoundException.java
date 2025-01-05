package com.arjun.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(long id){
        super("Could Not Find The User By Id "+id);
    }
}
