package com.training.designpatterns.strategydesignpattern;

public class SortingContext {

	private SortingStrategy sortingStrategy;

	public SortingContext(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void performSorting(int[] array) {
		sortingStrategy.sort(array);
	}
}
