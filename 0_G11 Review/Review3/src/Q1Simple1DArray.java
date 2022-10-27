/** Wing Li
 *  September 12, 2022
 *  Do some basic actions with an array
 */

import java.util.Scanner;

public class Q1Simple1DArray {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        int n, temp, sampleSum;
        int[] simpleArray;

        //a: Ask user to enter an integer n, then declare an array of integer of size n
        System.out.print("Input an integer: ");

        n = Integer.parseInt(keyboard.nextLine());

        simpleArray = new int[n];

        //b: Initialize all elements of the array to one
        for (int i = 0; i < n; i++) {
            simpleArray[i] = 1;
        }

        //c: Ask user to enter n integers, and fill the arrays with these integer in order
        System.out.println("Input " + n + " integers");
        for (int i = 0; i < n; i++) {
            simpleArray[i] = Integer.parseInt(keyboard.nextLine());
        }

        //d: Switch the values at either end of the array
        temp = simpleArray[0];
        simpleArray[0] = simpleArray[n - 1];
        simpleArray[n - 1] = temp;

        //e: Change any negative values to positive values (of the same magnitude)
        for (int i = 0; i < n; i++) {
            if (simpleArray[i] < 0) {
                simpleArray[i] = -1 * simpleArray[i];
            }
        }

        //f: Set the variable sampleSum to the sum of the values of all the elements
        sampleSum = 0;
        for (int i = 0; i < n; i++) {
            sampleSum += simpleArray[i];
        }

        //g: Print all the even numbers in the array
        for (int i = 0; i < n; i++) {
            if (simpleArray[i] % 2 == 0) {
                System.out.println(simpleArray[i]);
            }
        }

        keyboard.close();
    }
}
