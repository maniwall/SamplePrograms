package com.training.basics.exceptions;

public class InvalidAgeException extends RuntimeException {
	
	InvalidAgeException(){
		super();
	}
	
	InvalidAgeException(String message){
		super(message);
	}

}
