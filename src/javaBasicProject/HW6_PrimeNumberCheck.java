package javaBasicProject;

import java.util.Scanner;

public class HW6_PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a java program to check whether a given number is prime or not
		 * 
		 */

		Scanner getNum = new Scanner(System.in);

		System.out.println("Please enter a number");

		int Num1 = getNum.nextInt();

		int z = 2;

		while (z < Num1) {
			if (Num1 % z == 0) {
				System.out.println("Your number is not a prime.");
				break;

			} else if (z == Num1 - 1) {
				System.out.println("Your number is prime!");
				break;

			} else {
				z++;
			}
		}

	}

}
