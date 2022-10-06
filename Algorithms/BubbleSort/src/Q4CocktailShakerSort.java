/**
 * Wing Li
 * Oct 3, 2022
 * Uses a cocktail shaker sort to sort a double array in ascending order
 * Cocktail sort:
 * On odd passes, it bubble sorts upwards
 * On even passes, it bubble sorts downwards
 */

public class Q4CocktailShakerSort {
    public static void shakeSort(double[] array) {
        boolean isSorted = false, isAscending = true;
        double temp;
        //int passes = 0;

        for (int i = array.length - 1; i > 0 && !isSorted; i--) {
            //passes++;
            isSorted = true;
            if (isAscending) {
                //Bubble sort up
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        isSorted = false;
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            } else {
                //Bubble sort down
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        isSorted = false;
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }

            isAscending = !isAscending;
        }
        //System.out.println(passes + " passes to sort");
    }

    public static void main(String[] args) {
        final double[] array = {320, -9.8, 4.9, 2, 0, 500, -14};

        shakeSort(array);

        for (double d : array) {
            System.out.println(d);
        }
    }
}
