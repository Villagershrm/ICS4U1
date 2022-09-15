/** 
	File Name: SplitExample.java
	Name: I. Lam
	Class: ICS3U1
	Date: November 8, 2019
	Description: This program demonstrates the use of the "split" method
   to retrieve individual words in a sentence
*/

   import java.util.*;
    public class SplitExample {
       public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
      
         String input = sc.nextLine();
      
      	String[] list;
			
			list = input.split(" ");
			
         // output each item on the list array, which are
         // the individual words
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
			
         // output each of the words backwards
			for (int i = 0; i < list.length; i++) {
				for (int j = list[i].length() - 1; j >= 0; j--) {	
					System.out.print(list[i].charAt(j));
				}
				System.out.println();
			}
      }
   }