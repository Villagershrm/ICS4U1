/**
 * Wing Li
 * Sept 28, 2022
 * Create an insertionSort method to sort an array of double values
 */
public class Q2InsertionSortSimple {
    /*
     * How this version of insertion sort works (didn't look at pseudocode)
     * Grabs each element to the right of the current sorted array and pulls it left until it's in the correct place
     * 
     */
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
    public static void main(String[] args) throws Exception {
        final double[] array = {20.0, 2, 69, -42, 0};
        
        insertionSort(array);

        for (double i : array) {
            System.out.println(i);
        }
    }
}
