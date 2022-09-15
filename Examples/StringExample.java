/** 
	File Name: StringExample.java
	Name: I. Lam
	Class: ICS3U1
	Date: December 8, 2018
	Description: This program demonstrates the use of different methods in String class
*/

import java.util.*;

public class StringExample {
   public static void main (String[] args) { 
      Scanner sc = new Scanner(System.in);
      
      // Output the length of the string
      String input = sc.nextLine();
      System.out.println(input.length());
      
      // Output each character of the string on separate line
      for (int i = 0; i < input.length(); i ++){
         System.out.println(input.charAt(i));
      }
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = "Hi";
      
   //   System.out.println(s1.equals(s2));
   //   System.out.println(s1.equals(s3));
      
      System.out.println(s1.compareTo(s3));
      System.out.println(s3.compareTo(s1));
      
      String name = "MsLam";
      
      // print each character of the string on separate line
      for (int i = 0; i < name.length(); i++) {
         System.out.println(name.charAt(i));
      }
      
      // changing character at index 2 to 'i'
      
      // THIS DOES NOT WORK because charAt is a method that 
      // return a character, not a variable
      // name.charAt(2) = 'i';
      
      // method 1: convert string to character array and 
      // assign the character to the specific item in
      // the array and form a string base on the new array
      char[] charList = name.toCharArray();
      charList[3] = 'i';
      name = new String(charList);
      System.out.println(name);
      
      // method 2: use substring
      name = name.substring(0, 3) + 'i' + name.substring(4);
   }
}