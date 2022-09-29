/**
 * Wing Li
 * Sept 28, 2022
 * Create an insertionSort method to sort an array of double values
 */
public class Q2InsertionSortSimple {
    /*
     * How this version of insertion sort works (didn't look at pseudocode)
     * Grabs each element to the right of the current sorted array and pulls it 
     * towards the left until it's in the correct place
     * 
     * I checked the pseudocode and my code is pretty similar, however my code is less efficient.
     * The pseudocode moves every value in front of the item (in its sorted position) to the right 1 index
     * and only moves the current value to its final correct spot.
     */
    public static void insertionSort(double[] array) {
        double temp;
        int index;
        for (int i = 1; i < array.length; i++) { //Arrays of size 1 or 0 are always sorted
            index = i;
            //double current = array[i];
            while (index > 0 && array[index] < array[index - 1]) {
                //Swap, and maybe run this block of code again if we need to swap another time
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
                /* Better code
                 * array[index] = array[index - 1];
                 * j--;
                 */
            }
            //array[index] = current;
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
