/**
 * Wing Li
 * Sept 30, 2022
 * Performs a selection sort on a string array of size 10, provided by the user
 */
import java.util.Scanner;

public class Q3SelectionSortString {
    public static void selectionSort(String[] array) {
        int minIndex = -1;
        String strCurrentMin, temp;
        for (int i = 0; i < array.length; i++) {
            //Find the minimum value of this subset
            strCurrentMin = array[i];
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (strCurrentMin.compareTo(array[j]) > 0) {
                    //This is the new minimum value
                    strCurrentMin = array[j];
                    minIndex = j;
                }
            }
            //Swap the minimum value with the current index
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] array = new String[10];

        System.out.println("Input 10 strings");
        for (int i = 0; i < 10; i++) {
            array[i] = keyboard.nextLine();
        }
        System.out.println();

        selectionSort(array);

        for (String string : array) {
            System.out.println(string);
        }
        keyboard.close();
    }
}
