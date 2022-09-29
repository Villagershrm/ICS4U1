/**
 * Wing Li
 * Sept 27, 2022
 * Write a method to perform a binary search
 */
public class Q1BinarySearch {
    public static int binarySearch(int[] array, int item) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;
        int middle;
        boolean found = false;

        while (left <= right && !found) {
            middle = (left + right) / 2;
            if (array[middle] == item) {
                //Found it!
                index = middle;
                found = true;
            } else if (item > array[middle]) {
                //In right half
                left = middle + 1;
            } else {
                //In left half
                right = middle - 1;
            }
        }

        return index;
    }
    public static void main(String[] args) throws Exception {
        final int[] ARRAY = {23, 27, 30, 34, 41, 49, 51, 55, 57, 60, 67, 72, 78, 83, 96};

        System.out.println(binarySearch(ARRAY, 72));
        System.out.println(binarySearch(ARRAY, 41));
        System.out.println(binarySearch(ARRAY, 62));
    }
}
