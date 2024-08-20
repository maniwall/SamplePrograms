package com.training.basics.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsRemovalSample {

	public static void main(String[] args) {
		
		Collection<Integer> crossedVlansubs = new ArrayList<>();
		crossedVlansubs.add(1);
		crossedVlansubs.add(2);
		crossedVlansubs.add(3);
		crossedVlansubs.add(4);
		crossedVlansubs.add(5);
		
		System.out.println("before crossedVlansubs :: " + crossedVlansubs);
		
		Collection<Integer> crossedVlansubs1 = new ArrayList<>();
		// crossedVlansubs.add();
		crossedVlansubs1.add(2);
		crossedVlansubs1.add(10);
		crossedVlansubs1.add(20);
		//crossedVlansubs.add(3);
		
		crossedVlansubs.removeAll(crossedVlansubs1);
		
		System.out.println("After crossedVlansubs :: " + crossedVlansubs);

	}

}
