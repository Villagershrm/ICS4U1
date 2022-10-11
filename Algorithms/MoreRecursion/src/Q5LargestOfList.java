/**
 * Wing Li
 * Oct 11, 2022
 * Determine the largest of a list of values using recursion
 * Hint: Use a wrapper method
 */
public class Q5LargestOfList {
    public static int largest(int[] list, int start, int end) {
        if (end - start == 0) {
            return list[start];
        }
        if (list[start] <= list[end]) {
            return largest(list, start + 1, end);
        } 
        return largest(list, start, end - 1);
    }
    public static int largest(int[] list) {
        return largest(list, 0, list.length - 1);
    }

    public static void main(String[] args) {
        final int[] LIST = {2, 3, 124214, -23, 4, 10};
        System.out.println(largest(LIST));
    }
}
