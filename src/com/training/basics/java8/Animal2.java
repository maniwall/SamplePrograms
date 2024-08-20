package com.training.basics.java8;

@FunctionalInterface
public interface Animal2 {
	
	public void print();
	
	public default void move(){
		System.out.println("Animal2 Moving");
	}
	
	public static void staticMethod(){
		System.out.println("coming from Animal2 staticMethod");
	}
}
