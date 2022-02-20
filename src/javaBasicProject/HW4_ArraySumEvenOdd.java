package javaBasicProject;

public class HW4_ArraySumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 * 
		 */

		int[][] range = { { 15, 16, 17 }, { 25, 47, 66 }, { 5, 8, 22 }

		};

		int evenSum = 0;

		int oddSum = 0;

		int size = range.length;

		for (int x = 0; x < size; x++) {

			for (int y = 0; y < range[x].length; y++) {

				if (range[x][y] % 2 == 0) {

					evenSum = evenSum + range[x][y];

				} else {

					oddSum = oddSum + range[x][y];
				}

			}
		}

		System.out.println("Sum of even numbers is " + evenSum);
		
		System.out.println("Sum of odd numbers is " + oddSum);

	}

}
