/**
 * Wing Li
 * Write a modified seq. search that also swaps the item and the index before it as well as returning its index 
 */
import java.util.Scanner;

public class Q4ModifiedSequentialSearch {
    public static int findInt(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                if (i > 0) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Length of array: ");
        int arrayLength = keyboard.nextInt();
        int[] array = new int[arrayLength];
        int input;

        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.nextInt();
        }

        System.out.println("List: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("Gimme value: ");
        input = keyboard.nextInt();

        while (input != 0) {
            System.out.println(findInt(array, input));

            System.out.print("Gimme value: ");
            input = keyboard.nextInt();
        }
        keyboard.close();
        //This could improve the efficency of a sequential search, as repeated searches of the same value are faster
    }
}
