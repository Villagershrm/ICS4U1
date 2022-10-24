/**
 * Wing Li
 * Sept 30, 2022
 * Create a method that performs a selection sort (selection sort can either grab the minimum or maximum value)
 */
public class Q1SelectionSortSimple {
    public static void selectionSort(double[] array) {
        int minIndex = -1;
        double dblCurrentMin, temp;
        for (int i = 0; i < array.length; i++) {
            //Find the minimum value of this subset
            dblCurrentMin = Double.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if (array[j] < dblCurrentMin) {
                    //This is the new minimum value
                    dblCurrentMin = array[j];
                    minIndex = j;
                }
            }
            //Swap the minimum value with the current index
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) throws Exception {
        final double[] array = {5, 6, 0.4, -3423049, 10, 420, 41, 69, -8};
        
        selectionSort(array);

        for (double d : array) {
            System.out.println(d);
        }
    }
}
