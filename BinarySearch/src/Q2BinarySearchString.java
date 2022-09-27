/**
 * Wing Li
 * Sept 27, 2022
 * Write a method to perform a binary search for a string
 */
public class Q2BinarySearchString {
    public static int binarySearch(String[] array, String item) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;
        int middle;
        boolean found = false;

        while (left <= right && !found) {
            middle = (left + right) / 2;
            if (array[middle].equals(item)) {
                //Found it!
                index = middle;
                found = true;
            } else if (item.compareTo(array[middle]) > 0) {
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
        final String[] ARRAY = {"apple", "bald", "bone", "flame", "mountain", "orchestra", "owen", "potato", "red", "wing", "zebra"};

        System.out.println(binarySearch(ARRAY, "mountain"));
        System.out.println(binarySearch(ARRAY, "potato"));
        System.out.println(binarySearch(ARRAY, "AHHHAHAHAHAH"));
    }
}
