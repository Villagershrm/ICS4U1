/**
 * Wing Li
 * Oct 3, 2022
 * Create a simple bubble sort algorithm
 */
public class Q2BubbleSortSimple {
    public static void bubbleSort (double[] array) {
        boolean isSorted = false;
        double temp;
        //int passes = 0;

        for (int i = array.length - 1; i > 0 && !isSorted; i--) {
            //passes++;
            isSorted = true;
            //Start swapping
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //System.out.println(passes + " passes to sort");
    }

    public static void main(String[] args) {
        final double[] array = {320, -9.8, 4.9, 2, 0, 500, -14};
        //final double[] array2 = {4, 3};

        bubbleSort(array);

        for (double d : array) {
            System.out.println(d);
        }
    }
}
