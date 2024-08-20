package com.training.basics;

import java.util.ArrayList;
import java.util.List;

public class ContinueDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("test");
		
		for(String name : names) {
			
			if(name.equalsIgnoreCase("test")) {
				continue;
			}
			
			System.out.println("Inside for each Block!!");
		}
		
		System.out.println("Inside Main Block!!");
	}

}
