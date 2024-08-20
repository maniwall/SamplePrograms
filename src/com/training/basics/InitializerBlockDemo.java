package com.training.basics;

public class InitializerBlockDemo {
	final int value = 10;
	final String name = "name";

	{
		System.out.println("comming from child initialzer block!!");
	}

	/* Runner(){
		// logic
		// super();
		
		// initialzer blocks
		System.out.println("coming from Default constructor");
	}

	Runner(int a){
		// logic
		// this();
		System.out.println("coming from Parameterized constructor :: " + a);
	} */

	public static void main(String[] args) {
		Runner runner = new Runner();
		// Runner runner1 = new Runner(15);
	}

}
