/** 
   File Name: parameterPassing3.java
   Name: I. Lam
   Class: ICS3U1
   Date: November 25, 2018
   Description: This program demonstrates what happens when String are passed as parameters and 
   modified inside a method.
*/

public class ParameterPassing3{
   public static void main (String[] args) {
      String line1 = "ABC";
      String line2 = "DEF";
      swap (line1, line2);
      System.out.println(line1+ " "+ line2);
   }
   
   /**
    * Swap the two given String (OR DOES IT??) 
    *
    * @param  s1   the first String 
    * @param  s2   the second String
    */   

   public static void swap (String s1, String s2) {
      String temp;
      temp = s1;
      s1 = s2;
      s2 = temp;
   }
}