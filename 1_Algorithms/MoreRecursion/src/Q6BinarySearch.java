/**
 * Wing Li
 * October 11, 2022
 * Implement binary search using recursion
 */
public class Q6BinarySearch {
    //Wrapper
    public static int binarySearch(int[] list, int target) {
        return binarySearch(list, target, 0, list.length - 1);
    }

    public static int binarySearch(int[] list, int target, int lower, int higher) {
        //Base case: target does not exist in the array
        if (higher < lower) {
            return -1;
        }

        int middle = (higher + lower) / 2;

        //Base case: target was found in the array
        if (list[middle] == target) {
            return middle;
        }

        if (list[middle] < target) {
            //target (if it exists) is in the top half of the current search area
            return binarySearch(list, target, middle + 1, higher);
        }

        //target (if it exists) is in the bottom half of the current search area
        return binarySearch(list, target, lower, middle - 1);
    }


    public static void main(String[] args) {
        final int[] ARRAY = {23, 27, 30, 34, 41, 49, 51, 55, 57, 60, 67, 72, 78, 83, 96};

        System.out.println(binarySearch(ARRAY, 23));
        System.out.println(binarySearch(ARRAY, 24));
        System.out.println(binarySearch(ARRAY, 72));
    }
}
