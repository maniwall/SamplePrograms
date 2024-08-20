package com.training.basics.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EachWordReverseInString {

	public static void main(String[] args) {
		
		String sample = "Hello world using java!!";
		String[] words = sample.split(" ");
		
		List<String> result = Arrays.stream(words)
		.map(word -> new StringBuilder(word).reverse().toString())
		.collect(Collectors.toList());

		System.out.println(result);
	}

}
