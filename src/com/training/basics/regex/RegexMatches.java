package com.training.basics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile(".m");
		Matcher m1 = p1.matcher(".am");
		boolean b1 = m1.matches();
		System.out.println("B1 :: " + b1);

		boolean b2 = Pattern.matches(".m", "am");
		System.out.println("B2 :: " + b2);
		
		boolean b3 = Pattern.compile("^m").matcher("mani").find();
		System.out.println("B3 :: " + b3);
		
		System.out.println("**********************************");
		
		System.out.println(Pattern.matches("[abc]", "amn")); // False
		System.out.println(Pattern.matches("[^abc]", "ma")); // False
		System.out.println(Pattern.matches("[a-zA-S]", "T")); // False
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "amn09")); // True
		System.out.println(Pattern.matches("[xyz]?", "x")); // True
		System.out.println(Pattern.matches("[xyz]+", "x")); // True
		System.out.println(Pattern.matches("[xyz]*", "xyyza")); // True
		System.out.println(Pattern.matches("[abc]", "a")); // True 
		System.out.println(Pattern.matches("\\d", "1")); // True
		System.out.println(Pattern.matches("\\D", "9")); // False
	}

}
