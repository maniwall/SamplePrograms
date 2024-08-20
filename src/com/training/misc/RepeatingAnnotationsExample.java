package com.training.misc;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;

//Declaring repeatable annotation type  
@Repeatable(Games.class)  
@interface Game{  
 String name();  
 String day();  
}

@Retention(RetentionPolicy.RUNTIME)  
@interface Games{  
    Game[] value();  
}  


public class RepeatingAnnotationsExample {

	public static void main(String[] args) {
		

	}

}
