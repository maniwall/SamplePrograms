package com.training.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UBSTest {

	public static void main(String[] args) {

		// Blocked - 1
		// Non-Blocked - 0

		// String REGEX = "(111).(.*).(255)";
		// String REGEX = "111.*.255";
		//String REGEX = "12.*";
		
		String REGEX = "111.*.255";
	    String actualString = "111.12.5.255";
		
		Pattern pattern = Pattern.compile(REGEX);
		System.out.println("pattern value :: " + pattern.pattern());

		boolean matches = pattern.matcher(actualString).matches();

		System.out.println("actualString " + "contains REGEX = " + matches);

		// Matcher matcher = pattern.matcher("*.123.*", "12.1.123.45");
		// System.out.println(pattern.matches(regex, "12.1.123.45"));

		// System.out.println(matcher.find());		
		
		System.out.println("***********************************");

	}

}
