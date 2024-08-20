package com.training.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

		// String REGEX = ".*org.*";
		/*
		 * String REGEX = "(.*)(divi)(.*)?"; String actualString =
		 * "geeksforgeeks.org of individual testing";
		 * 
		 * Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE); boolean
		 * matches = pattern.matcher(actualString).matches();
		 * 
		 * System.out.println("actualString " + "contains REGEX = " + matches);
		 */
		
		Pattern pattern = Pattern.compile("[abc]");
		Matcher matcher = pattern.matcher("a123b1c3a3b4c5a6c!!");
		
		while(matcher.find()) {
			System.out.println(matcher.start() +"..."+ matcher.group());
		}
	}

}
