package javaBasicProject;

public class HW5_Swap2Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to swap 2 numbers without a temporary variable?
		 * 
		 */
		int x = 5;

		int y = 6;

		System.out.println("Before swap:");

		System.out.println("x value: " + x);

		System.out.println("y value: " + y);

		x = x + y;

		y = x - y;

		x = x - y;

		System.out.println("After swap:");

		System.out.println("x value: " + x);

		System.out.println("y value: " + y);

	}

}
