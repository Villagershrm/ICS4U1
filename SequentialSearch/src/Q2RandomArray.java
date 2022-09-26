/**
 * Wing Li
 * September 26, 2022
 * Write a method to return the index of a certain integer in an int[] array, -1 if it cannot be found
 * The array is randomly generated
 */
import java.util.Scanner;

public class Q2RandomArray {
    public static int findInt(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (100 * Math.random());
        }
        int item = keyboard.nextInt();
        System.out.println(findInt(array, item));
        keyboard.close();
    }
}
