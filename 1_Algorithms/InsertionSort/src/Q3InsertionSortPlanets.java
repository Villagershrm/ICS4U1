/**
 * Wing Li
 * Sept 28, 2022
 * Uses an insertion sort to sort an array of strings
 */
public class Q3InsertionSortPlanets {
    public static void insertionSort(String[] array) {
        String temp;
        int index;
        for (int i = 1; i < array.length; i++) { //Arrays of size 1 or 0 are always sorted
            index = i;
            while (index > 0 && array[index].compareTo(array[index - 1]) < 0) {
                //Swap, and maybe run this block of code again if we need to swap another time
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
    public static void main(String[] args) {
        final String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", 
        "Neptune", "Pluto"};

        insertionSort(planets);

        for (String string : planets) {
            System.out.print(string + " ");
        }
    }
}
