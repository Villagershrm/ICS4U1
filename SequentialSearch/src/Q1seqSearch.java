/**
 * Wing Li
 * September 26, 2022
 * Write a method to return the index of a certain String in a String[] array, -1 if it cannot be found
 */
public class Q1seqSearch {
    public static int findString(String[] array, String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final String[] array = {"potato", "muffin", "bald", "upgrade  ur eyes man"};
        System.out.println(findString(array, "muffin"));
        System.out.println(findString(array, "AAAAAAA"));
    }
}
