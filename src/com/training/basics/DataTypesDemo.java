package com.training.basics;

/**
 * 
 * @author mabo0222
 *
 */
public class DataTypesDemo {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// primitive
		// byte byteValue = 120;
		// int intValue = byteValue;

		/*
		 * int intValue = 500; byte byteValue = (byte) intValue; // Type casting float
		 * floatValue = intValue;
		 * 
		 * float floatValue1 = 3.25F; double doubleValue = 11122333.45;
		 * 
		 * char ch = 'a'; int chIntValue = ch;
		 * 
		 * 
		 * System.out.println("intValue :: " + intValue);
		 * System.out.println("byteValue :: " + byteValue);
		 * System.out.println("floatVlaue :: " + floatValue);
		 * System.out.println("chIntValue :: " + chIntValue);
		 */

		// Non Primitive or User Defined Data types
		// String str = "Hello";
		// System.out.println("str :: " + str);

		/*
		 * int a = 10; Integer b = a; // new Integer(10); Float floatValue = 112.34f;
		 * Double doubleValue = 112.34;
		 * 
		 * floatValue.byteValue();
		 * 
		 * System.out.println("wrapper class :: " +b.floatValue());
		 */
		// System.out.println("wrapper class :: " +Integer.MAX_VALUE);
		// System.out.println("wrapper class :: " +Integer.MIN_VALUE);

		String str = "Hello" + "\t" + "World!!";
		System.out.println("String value :: " + str);
		
		Integer b =10;
		System.out.println("wrapper class :: " +b.floatValue()); // 10.0
	}

}
