package com.training.DS;

public class ReverseArray {

	public static void main(String[] args) {
		// int[] numbers = { 2, 6, 7, 8, 9 };
		ReverseArray ra = new ReverseArray();
		int[] numbers = new int[10000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
		System.out.println(numbers.length);
		
		long startReverseArray = System.currentTimeMillis();
		int[] reverseNumbers = ra.reverseArray(numbers);
		long endReverseArray = System.currentTimeMillis();
		ra.printArray(reverseNumbers);
		System.out.println("Time Taken reverseNumbers :: " + (endReverseArray - startReverseArray));

		long startReverseArrayBestApproach = System.currentTimeMillis();
		int[] reverseArrayBestApproach = ra.reverseArrayBestApproach(numbers);
		long endReverseArrayBestApproach = System.currentTimeMillis();
		ra.printArray(reverseArrayBestApproach);
		System.out.println("Time Taken reverseArrayBestApproach :: " + (endReverseArrayBestApproach - startReverseArrayBestApproach));
	}

	private int[] reverseArray(int[] numbers) {
		int j = 0;
		int[] result = new int[numbers.length];
		for (int i = numbers.length - 1; i >= 0; i--, j++) {
			result[j] = numbers[i];
		}
		return result;
	}

	private int[] reverseArrayBestApproach(int[] numbers) {
		int start = 0;
		int end = numbers.length - 1;

		while (start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;

			start++;
			end--;
		}

		return numbers;
	}

	public void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

}
