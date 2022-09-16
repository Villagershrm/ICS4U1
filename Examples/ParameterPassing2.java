/** 
   File Name: parameterPassing2.java
   Name: I. Lam
   Class: ICS3U1
   Date: November 25, 2018
   Description: This program demonstrates parameter passing by reference
*/

public class ParameterPassing2 {
   public static void main(String[] args) {
      int[] num = {10, 20};
   
      System.out.println("Before swap - num[0]: "+num[0]+", num[1]: "+num[1]); 
      swap (num);
      System.out.println("After swap - num[0]: "+num[0]+", num[1]: "+num[1]);
   }

   /**
    * Swap the two integer inside the array
    *
    * @param  list   an array of two integer 
    */   
   public static void swap (int[] list) {
      int temp;
   
      System.out.println("Inside swap (start) - list[0]: "+list[0]+", list[1]: "+list[1]);
      temp = list[0];
      list[0] = list[1];
      list[1] = temp;
      System.out.println("Inside swap (end) - list[0]: "+list[0]+", list[1]: "+list[1]);
   
   }
}