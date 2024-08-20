package com.training.basics;

// polymorphism - number, order, or type of parameter

public class SampleMethodOverloading {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public String sum(String str1, String str2) {
		return str1 + str2;
	}
	
	public Double sum(double d1, double d2) {
		return d1 + d2;
	}
	
	public static String sum(String str1, String str2, String str3) {
		return str1 + str2;
	}
	
	public String sum(int a, String b) {
		return a + b;
	}
	
	public String sum(String b, int a) {
		return a + b;
	}
	

}
