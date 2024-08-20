package com.training.basics;

public class Operators {
	
	public void demo() {
		int a = 10; // 10100 - 00010
		int b = 20; // 10100
		
		
		
		int biggerNumber = a < b ? a : b;
		
		// System.out.println("Ternary Operator :: " + biggerNumber);
		
		int c = a + b; 
		int value = a & b;
		
		
		
		// System.out.println(Integer.toBinaryString(20));
		System.out.println("And Bitwise Operator :: " + value);
		
		sum(a, b);
		
		// a, b - operand 
		// + - operator
		
		// a++; //increment
		// b--; // decrement
		
		System.out.println("a :: " + ++a); // ++a
		System.out.println("a :: " + a);
		System.out.println("b :: " + b--);
		
		boolean booleanValue = false;
		boolean booleanValue1 = !booleanValue;
		
		boolean isEqual = (10 == 20); // false
		
		
		System.out.println("Binary value of " + a + " :: " + Integer.toBinaryString(a));
		System.out.println("Binary value of " + b + " :: " + Integer.toBinaryString(b));
		System.out.println();
		
		System.out.println("Binary bit wise a & b value :: " + Integer.toBinaryString(a & b));
		System.out.println("int bit wise a & b value :: " + (a & b));
		System.out.println();
		
		System.out.println("Binary bit wise ~(a & b) value :: " + Integer.toBinaryString(~(a & b)));
		System.out.println("int bit wise ~(a & b) value :: " + ~(a & b));
		System.out.println();
		
		
		System.out.println("int bit wise ~a value :: " + Integer.toBinaryString(~a));
		System.out.println("int bit wise ~a value :: " + ~a );
		System.out.println();
		
		System.out.println("Binary bit wise ~a & b value :: " + Integer.toBinaryString(~a & b));
		System.out.println("int bit wise ~a & b value :: " + (~a & b));
		System.out.println();
		
		System.out.println();
		System.out.println();
		
		/* if(isEqual || a == 11) {
			// logic
		} else {
			// another logic
		}
		
		while(a >= 10) {
			// do logic
		}
		
		
		
		char ch = 'a';
		char value1 = 'a' + 'c'; */
		
		// System.out.println("value :: " + value1);
	}
	
	/**
	 * Performing sum of 2 numbers
	 * 
	 * @param a of type int
	 * @param b of type int
	 * @return int value
	 */
	public static int sum(int a, int b) {
		
		// logic
		return a + b;
	}

}
