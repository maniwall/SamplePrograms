package com.training.designpatterns.strategydesignpattern;

public class Client {

	public static void main(String[] args) {

		SortingContext context1 = new SortingContext(new BubbleSorting());
		int[] array = { 5, 4, 7, 9, 2 };
		context1.performSorting(array);

		SortingContext context2 = new SortingContext(new QuickSorting());
		context2.performSorting(array);

		context2.setSortingStrategy(new MergeSorting());
		context2.performSorting(array);
	}

}
