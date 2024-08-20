package com.training.designpatterns.strategydesignpattern;

public class MergeSorting implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Sorting using Merge Sort");	
	}

}
