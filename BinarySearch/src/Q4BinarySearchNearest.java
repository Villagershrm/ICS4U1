/**
 * Wing Li
 * Sept 27, 2022
 * Write a method to perform a binary search, and returns the index of the nearest value if the value cannot be found
 */
public class Q4BinarySearchNearest {
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

        if (!found) {
            if (item > array[array.length - 1]) {
                return array.length - 1;
            } else if (item < array[0]) {
                return 0;
            }
            
            if (Math.abs(array[right] - item) > Math.abs(array[left] - item)) {
                index = left;
            } else {
                index = right;
            }
        }

        return index;
    }
    public static void main(String[] args) throws Exception {
        final int[] ARRAY = {23, 27, 30, 34, 41, 49, 51, 55, 57, 60, 67, 72, 78, 83, 96};

        System.out.println(binarySearch(ARRAY, 72));
        System.out.println(binarySearch(ARRAY, 41));
        System.out.println(binarySearch(ARRAY, 26));
        System.out.println(binarySearch(ARRAY, 56));
        System.out.println(binarySearch(ARRAY, 62));
        System.out.println(binarySearch(ARRAY, 262));
    }
}
