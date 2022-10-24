/**
 * Wing Li
 * October 2, 2022
 * Grabs the k largest numbers in an array
*/
public class Q5SelectionSortPartialList {
    /**
     * @param k The number of (largest) numbers we have to sort
     * @param array The array to sort data from.
     * 
     * @return The last k values of the array will be sorted.
     */
    public static void selectionSortPartial (double[] array, int k) {
        double currentLargest, temp;
        int indexMax = -1;
        for (int i = array.length - 1; i >= array.length - k - 1; i--) {
            //Find the largest value of this subset
            currentLargest = -1 * Double.MAX_VALUE;
            for (int j = i; j >= 0; j--) {
                if (array[j] > currentLargest) {
                    //New largest value found
                    currentLargest = array[j];
                    indexMax = j;
                }
            }

            //Swap largest value with current index
            temp = array[i];
            array[i] = array[indexMax];
            array[indexMax] = temp;
        }
    }
    public static void main(String[] args) {
        final double[] array = {5, 6, 0.4, -3423049, 10, 420, 41, 69, -8};
        final int k = 5;

        selectionSortPartial(array, k);

        for (int i = array.length - 1; i > array.length - 1 - k; i--) {
            System.out.println(array[i]);
        }
    }
}