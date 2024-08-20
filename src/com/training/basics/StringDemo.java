package com.training.basics;

public class StringDemo {
	
	public void demo() {
		 

		// int value = 10;
		String message = "Hello World !!"; // String literal declaration
		String message1 = "Hello World !!"; //
		String message2 = "Hello World !!";

		boolean comparision = message == message1;

		System.out.println("Literal comparision :: " + (message == message1)); // True
		System.out.println("Literal Intern :: " + message1.intern());

		// message = "Some other value";

		String object = new String();
		String blogName1 = new String("demo.java.com"); // String creation with using cons
		String blogName2 = new String("demo.java.com");
		String blogName3 = new String("demo.java.com");

		String blogName3Intern = blogName3.intern(); // "demo.java.com"
		String blogName2Intern = blogName2.intern(); // "demo.java.com"

		System.out.println("Object blogName3Intern intern  :: " + blogName3.intern());
		System.out.println("Object intern comparision :: " + (blogName3Intern == blogName2Intern));

		System.out.println();
		System.out.println();

		System.out.println("Object == operator comparision :: " + (blogName3 == blogName2)); // Reference
		System.out.println("Object equals method comparision :: " + blogName3.equals(blogName2)); // values
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("String startsWith check :: " + blogName3.startsWith("some"));
		
		System.out.println();
		
		System.out.println("String sub-string check :: " + blogName3.substring(5, 9));
		
		System.out.println();
		
		
		System.out.println("String sub-string check :: " + blogName3.concat(message2));
		
		
		System.out.println("String replace check :: " + blogName3.replace(".", ""));
		
		/* String value = "Message";
		for(int i =0; i<=100; i++) {
			value = value +  i; // "Message" 1
			System.out.println("value :: " + value);
		} */

	
	}

}
