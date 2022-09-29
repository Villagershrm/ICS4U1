/**
 * Wing Li
 * Write a method to return the index of a certain String in a String[] array, -1 if it cannot be found
 * Iterate through the array backwards
 */
public class Q3seqSearchReversed {
    public static int findString(String[] array, String item) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] array = {"potato", "muffin", "corn"};
        System.out.println(findString(array, "corn"));
    }
}
