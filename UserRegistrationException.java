package com.bridgelabz.userregistrationjunit;

public class UserRegistrationException extends RuntimeException{

    public ExceptionType type;
    public enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_MOBILE_NUMBER, INVALID_EMAIL_ID, INVALID_PASSWORD,
    }

    public UserRegistrationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
