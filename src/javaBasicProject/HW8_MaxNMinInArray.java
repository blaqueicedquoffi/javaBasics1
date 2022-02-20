package javaBasicProject;

public class HW8_MaxNMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Maximum and minimum number in the array
		 * 
		 */

		int[] getNum = { 0, 4, 5, 9, 3, 8, 7 };

		int y = 0;

		for (int i = 0; i < getNum.length; i++) {
			int x = getNum[i];

			if (x > y) {
				y = x;
			}
		}
		
		System.out.println(y);

	}

}
