package com.srstech.exception.custom;

public class DivideByZeroException extends RuntimeException {

    public DivideByZeroException() {
        super();
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
