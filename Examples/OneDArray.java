/** 
	File Name: OneDArray.java
	Name: I. Lam
	Class: ICS3U1
	Date: November 8, 2019
	Description: This program demonstrates the use of one dimensional arrays
*/

public class OneDArray {
	public static void main (String[] args) {
		final int SIZE = 10;
		
		int[] list;             // declare an array of integer
		list = new int[SIZE];   // create the array
		
		for (int i = 0; i < SIZE; i++) {
			list[i] = 100;
		}
		
		// declare and create an array with inital values
		double[] marks = {45.3, 100, 99.3, 73.3};
		for (int i = 0; i < marks.length; i++) {
			marks[i] *= 1.1;
		}
		
	}
}