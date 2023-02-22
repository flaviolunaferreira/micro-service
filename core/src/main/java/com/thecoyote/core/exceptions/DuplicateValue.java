package com.thecoyote.core.exceptions;

public class DuplicateValue extends RuntimeException {

    public DuplicateValue(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateValue(String message) {
        super(message);
    }
}
