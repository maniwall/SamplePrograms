package com.training.pyramidpatterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of rows required to print in pattern1 :: ");
		int noOfRows = sc.nextInt();

		int rowCount = 1;

		for (int i = noOfRows; i >= 1; i--) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < rowCount; j++) {
				System.out.print(rowCount + " ");
			}

			System.out.println();
			rowCount++;
		}

	}

}
