//Sequential search using recursion
public class SequentialSearchRecursion {
    public static int search(int[] list, int value) {
        return search(list, value, 0);
    }
    
    public static int search (int[] list, int value, int index) {
        if (index > list.length - 1) {
            return -1;
        }
        if (list[index] == value) {
            return index;
        }
        return search(list, value, index + 1);
    }
}
