package com.training.basics.Collections;

public class DemoClass<T> {
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public static int add(int value1) {
		return value1;
	}
	
	
	public <T> T getValue(T value1){
		return value1;
	}
	

}
