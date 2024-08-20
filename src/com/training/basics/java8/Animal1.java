package com.training.basics.java8;

@FunctionalInterface
public interface Animal1 {
	
	public void print();
	
	public default void move(){
		System.out.println("Animal1 Moving");
	}
	
	public static void staticMethod(){
		System.out.println("coming from Animal1 staticMethod");
	}

}
