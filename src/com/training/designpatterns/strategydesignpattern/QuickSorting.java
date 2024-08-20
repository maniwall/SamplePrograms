package com.training.designpatterns.strategydesignpattern;

public class QuickSorting implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Sorting using Quick Sort");
	}

}
