package com.training.basics.java8;

public interface NormalInterface {
	
	public void print();
	public void print1();

	public default void move() {
		System.out.println("Animal1 Moving");
	}

	public static void staticMethod() {
		System.out.println("coming from Animal1 staticMethod");
	}
}
