package com.training.designpatterns.strategydesignpattern;

public class BubbleSorting implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Sorting using Bubble Sort");		
	}

}
