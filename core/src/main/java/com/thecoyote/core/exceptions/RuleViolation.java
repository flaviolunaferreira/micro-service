package com.thecoyote.core.exceptions;

public class RuleViolation extends RuntimeException {

    public RuleViolation(String message, Throwable cause) {
        super(message, cause);
    }

    public RuleViolation(String message) {
        super(message);
    }

}
