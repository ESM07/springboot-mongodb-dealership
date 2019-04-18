package com.example.springmongodbdealership.handler;

import com.example.springmongodbdealership.exception.CustomException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<CustomException> notFoundException(Exception e){
        CustomException exception = new CustomException(e.getMessage(),"Not Found");

        return new ResponseEntity<>(exception,new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

}
