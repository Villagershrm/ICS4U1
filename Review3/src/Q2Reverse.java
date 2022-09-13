/** Wing Li
 *  September 12, 2022
 *  Reverse an array in two ways
 */

import java.util.Scanner;

 public class Q2Reverse {
    public static void main(String[] args) {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        final int ARRAY_SIZE = 14;
        int[] array1 = new int[ARRAY_SIZE];
        int[] array2 = new int[ARRAY_SIZE];
        int temp;

        //Initialize array1
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array1[i] = Integer.parseInt(keyboard.nextLine());
        }

        //Put reversed array1 in array2
        for (int i = 0; i < ARRAY_SIZE / 2.0; i++) {
            array2[i] = array1[ARRAY_SIZE - 1 - i];
            array2[ARRAY_SIZE - i - 1] = array1[i];
        }

        //Print the second reversed array
        for (int iterator : array2) {
            System.out.print(iterator + " ");
        }

        //Version 2: Reverse the initial array
        //We don't have to swap the middle element in an odd numbered array
        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            temp = array1[i];
            array1[i] = array1[ARRAY_SIZE - 1 - i];
            array1[ARRAY_SIZE - 1 - i] = temp;
        }

        //Print the initial array, reversed
        System.out.println(); //Separates this output from the previous one

        for (int iterator : array1) {
            System.out.print(iterator + " ");
        }
        
        keyboard.close();
    }
}
