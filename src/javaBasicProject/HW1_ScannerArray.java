package javaBasicProject;

import java.util.Scanner;

public class HW1_ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array on int values using a scanner, and calculate the sum of all
		 * stored elements in that array.
		 * 
		 */

		Scanner getData = new Scanner(System.in);

		int sum = 0;

		System.out.println("Please enter the preferred size of your array: ");

		int getSize = getData.nextInt();

		int[] range = new int[getSize];

		int size = range.length;

		System.out.println("Please enter positive integers to calculate their sum in the array");

		for (int i = 0; i < size; i++) {

			range[i] = getData.nextInt();

			sum = sum + range[i];
		}
		
		System.out.println("Sum of all elements in the array:" + " " + sum);

	}

}
