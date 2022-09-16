/** 
	File Name: MethodExample1.java
	Name: I. Lam
	Class: ICS3U1
	Date: Noveber 15, 2018
	Description: This program demonstrates the different types of method declaration
   and the corresponding calls.
*/

import java.util.*;

public class MethodExample1 {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      greeting();
      System.out.println("Second time: ");
      greeting("Arthur");
         
      int result = sum(1, 2);
      	
      System.out.println(sum(4, 5));
   }
   
   /**
    * Output a greeting to the standard outp 
    *        
    */
   public static void greeting () {
      System.out.println("Hello World");
      System.out.println("Hi World");
      System.out.println("What a beautiful day!");
   }
   
   /**
    * Output, to the standard output, a greeting addressing to the given name 
    *
    * @param  name   the name of the greeting addresses to      
    */
   public static void greeting(String name) {
      System.out.println("Hello " + name);
      System.out.println("Hi " + name);
      System.out.println("How are you today!");
   }
      
   /**
    * Calculate the sum of the given two integers 
    *
    * @param  num1   the first integer of the sum
    * @param  num2   the second integer of the sum 
    * @return         the sum
    */
   public static int sum (int num1, int num2) {
   // 		int temp;		
   // 		temp = num1 + num2;
   // 		return temp;
      return num1 + num2;		
   }
   	
}