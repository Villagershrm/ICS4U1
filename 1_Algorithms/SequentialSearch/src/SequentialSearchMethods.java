/**
 * Wing Li
 * Implement three different sequential search algorithms
 */
public class SequentialSearchMethods {
    //Method 1: kinda bad, but easiest to understand at first
    public static int sequentialSearch1(int[] array, int item) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                index = i;
            }
        }
        return index;
    }

    //Method 2: Faster method 1; it exits as soon as we find the index
    public static int sequentialSearch2(int[] array, int item) {
        boolean found = false;
        int index = -1;
        for (int i = 0; (i < array.length) && !found; i++) {
            if (array[i] == item) {
                found = true;
                index = i;
            }
        }
        return index;
    }

    //Method 3: Better method 2; removes unnecessary boolean and integer variable
    public static int sequentialSearch3(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    } 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
