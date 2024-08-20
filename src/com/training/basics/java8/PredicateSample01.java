package com.training.basics.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample01 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i -> i%2 ==0;
		List<Integer> sampleList = Arrays.asList(20, 15, 13, 12, 19, 10);		
		sampleList.stream().filter(predicate).forEach(i -> System.out.println(i));
	}
	
	
	
	
}
