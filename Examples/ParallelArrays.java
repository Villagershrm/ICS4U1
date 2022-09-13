/** 
	File Name: ParallelArrays.java
	Name: I. Lam
	Class: ICS3U1
	Date: November 10, 2019
	Description: This program prompts user for a mark, then output
	the name of the student with that mark.  If mark not found, output 
   error message.
   This program demonstrates the use of parallel arrays.  
   Two arrays represents names and marks.
 */

 import java.util.*;  
	
	 public class ParallelArrays{
       public static void main (String[] args) {
         final int NUM = 4;
      
         double[] mark = new double[NUM];
         String[] name;
         name = new String[NUM];
      
      // Assume arrays filled with user input
      
			// Solution # 1
         double findMark = sc.nextDouble();
      	boolean found = false;
      	
         for (int i = 0; i < NUM && !found; i++) {
            if (mark[i] == findMark) {
               System.out.println(name[i]);
					found = true;
            }
         }
			
			if (!found) {
				System.out.println("Mark not found!");
			}
			
			// Solution #2
			int index = -1;
			for (int i = 0; i < NUM && index == -1; i++) {
				if (mark[i] == findMark) {
					index = i;
				}
			}
			
			if (index != -1) {
				System.out.println(name[index]);
			} else {
				System.out.println("Mark not found!");
			}
      }
   }