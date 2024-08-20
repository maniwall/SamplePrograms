package com.training.basics.java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo1 { // JAVA 8

	public static final String VALUE = "Interface_Variable";

	public int sum(int a, int b);
	// public void forEach(int a, int b);
	
	public default int forEach(int a, int b) {
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);
		return a + b;
	}
	
	public default int add(int a, int b) {
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);
		return a + b;
	}
	
	public default int add1(int a, int b) {
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);
		return a + b;
	}
	
	public default int add2(int a, int b) {
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);
		return a + b;
	}
	
	
		
	
	// Default
	// Static

}
