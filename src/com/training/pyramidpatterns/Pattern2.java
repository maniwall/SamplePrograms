package com.training.pyramidpatterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of rows to print in pattern2::");

		int noOfRows = sc.nextInt();
		int rowCount = noOfRows;

		for (int i = 0; i < noOfRows; i++) {

			/*
			 * for(int j=rowCount; j <= noOfRows - i && j >= 1; j--) {
			 * System.out.print(" "); }
			 */

			for (int j = 1; j <= i*2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}

			for (int j = rowCount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

			rowCount--;
		}
	}

}
