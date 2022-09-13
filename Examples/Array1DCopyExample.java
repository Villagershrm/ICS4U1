/** 
	File Name: Array1DCopyExample.java
	Name: I. Lam
	Class: ICS3U1
	Date: November 8, 2019
	Description: This program demonstrates two different ways to "copy" a 1D array
*/


public class Array1DCopyExample         {
	public static void main (String[] args) {
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = a1;
		
		a1[0] = 10;
		// What happens to a2?
		System.out.println(a1[0] + " " + a2[0]);
		
		int[] b1 = {1, 2, 3, 4, 5};
		int[] b2 = new int[b1.length];
		for (int i = 0; i < b1.length; i++) {
			b2[i] = b1[i];
		}
		b1[0] = 10;
		// What happens to b2;
		System.out.println(b1[0] + " " + b2[0]);  
		
	}
}