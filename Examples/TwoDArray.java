/** 
	File Name: TwoDArray.java
	Name: I. Lam
	Class: ICS3U1
	Date: November 12, 2019
	Description: This program demonstrates different uses of 2D arrays
 */

public class TwoDArray {
  public static void main (String[] args) {
    final int ROW = 3;
    final int COL = 2;
    
    // Declare and create a 2D Array
    int[][] table;
    table = new int[ROW][COL];
    
    // Traverse the 2D array to fill in values
    for (int i = 0; i < ROW; i++) {
      for (int j = 0; j < COL; j++) {
        table[i][j] = i * j;
      }
    } 
    
    // Assign a 1D array to point to one "row" of the 2D array
    int [] list = table[1];
    
    // Create a 2D array of non-uniform "row" size
    int[][] table2 = {
      {0, 1},
      {0, 1, 2, 3},
      {0, 1, 2}
    };
   
    // Create and traverse a 2D array of non-uniform "row" size
    int[][] table3 = new int [ROW][];
    table3[0] = new int[2];
    table3[1] = new int[4];
    table3[2] = new int[3];
    
    for (int i = 0; i < ROW; i++) {
      for (int j = 0; j < table3[i].length; j++) {
        table3[i][j] = 0;
      }
    }
                          
  }
}