package com.thecoyote.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(NotFound.class)
    public ResponseEntity<StandardError> notFoundException(NotFound e, ServletRequest request) {
        StandardError error = new StandardError (
                System.currentTimeMillis(),
                HttpStatus.NOT_FOUND.value(),
                e.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(IntegratyViolation.class)
    public ResponseEntity<StandardError> integratyViolation(IntegratyViolation e, ServletRequest request) {
        StandardError error = new StandardError(
                System.currentTimeMillis(),
                HttpStatus.BAD_REQUEST.value(),
                e.getMessage()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
    }

    @ExceptionHandler(DuplicateValue.class)
    public ResponseEntity<StandardError> duplicateValue(DuplicateValue e, ServletRequest request) {
        StandardError error = new StandardError (
                System.currentTimeMillis(),
                HttpStatus.NOT_ACCEPTABLE.value(),
                e.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(error);
    }

    @ExceptionHandler(RuleViolation.class)
    public ResponseEntity<StandardError> ruleViolation(RuleViolation e, ServletRequest request) {
        StandardError error = new StandardError (
                System.currentTimeMillis(),
                HttpStatus.NOT_ACCEPTABLE.value(),

                e.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(error);
    }

}
