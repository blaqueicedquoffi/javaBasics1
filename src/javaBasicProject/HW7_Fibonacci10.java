package javaBasicProject;

public class HW7_Fibonacci10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * 
		 */

		int x = 0;
		int y = 1;
		int counter = 1;

		while (counter <= 10) {
			System.out.print(x + " ");

			int z = x + y;

			x = y;

			y = z;

			counter++;

		}

	}

}
