package org.example.exception;

public class ProductAlreadyExistsException extends InvalidProductException{
    public ProductAlreadyExistsException(String message){
        super(message);
    }
}
