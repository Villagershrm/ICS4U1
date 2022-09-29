/**
 * Wing Li
 * Sept 28, 2022
 * Reads a list of double values (data type is not specified in question) and returns its median
 */
import java.util.Scanner;
public class Q4Median {
    public static void insertionSort(double[] array) {
        double temp;
        int index;
        for (int i = 1; i < array.length; i++) { //Arrays of size 1 or 0 are always sorted
            index = i;
            while (index > 0 && array[index] < array[index - 1]) {
                //Swap, and maybe run this block of code again if we need to swap another time
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int items;
        System.out.print("Input number of item to be processed: ");
        items = keyboard.nextInt();
        double[] array = new double[items];
        System.out.println("Input " + items + " number of numbers:");

        for (int i = 0; i < items; i++) {
            array[i] = keyboard.nextDouble();
        }

        insertionSort(array);

        if (items != 0 && items % 2 == 0) {
            System.out.println("Median: " + (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0);
        } else {
            System.out.println("Median: " + array[array.length / 2]);
        }

        keyboard.close();
    }
}
