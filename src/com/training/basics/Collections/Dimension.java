package com.training.basics.Collections;

public class Dimension<T, E> { // Dimension
	
	private T length;
	private T width;
	private E name;
	
	// T[] array = new T[5];
	
	int[] values= new int[4];
	
	
	
	
	
	
	Dimension(){
		Object[] valuesObje = new String[5];
		valuesObje[1] = "Test";
		valuesObje[0] = 123;
		
	}
	
	
	public Dimension(T length, T width, E name) {
		super();
		this.length = length;
		this.width = width;
		this.name = name;
	}
	
	
	


}
