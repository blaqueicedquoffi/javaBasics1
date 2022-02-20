package javaBasicProject;

public class HW3_2DArrayEvenNumbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * 
		 * Develop a program which will identify/print the even numbers only.
		 * 
		 */

		int[][] range = { { 11, 12, 25 }, { 13, 14, 15, 16 }, { 21, 22, 23 },

		};

		int size = range.length;

		for (int x = 0; x < size; x++) {

			for (int y = 0; y < range[x].length; y++) {

				if (range[x][y] % 2 == 0) {

					System.out.print(range[x][y] + " ");

				}

			}

		}

	}

}
