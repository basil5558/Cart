package com.shopping.cart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class ProductServiceException extends RuntimeException {
    String errorMessage;
    HttpStatusCode httpStatus;
    public ProductServiceException(String errorMessage, HttpStatusCode httpStatusCode){
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatusCode;
    }
}
