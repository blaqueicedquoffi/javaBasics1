package javaBasicProject;

public class HW2_SumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array of integer values.
		 * 
		 * Print the sum of all numbers.
		 * 
		 */

		int[][] numbers = { { 10, 20 }, { 30, 40, 50 }, { 60, 70, 80, 90 },

		};

		int sum = 0;

		for (int x = 0; x < numbers.length; x++) {

			for (int y = 0; y < numbers[x].length; y++) {

				sum = sum + numbers[x][y];// sum += numbers[x][y];

			}

			System.out.println(sum);
		}

	}

}
