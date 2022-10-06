/**
 * Wing Li
 * October 5, 2022
 * Solution to the Tower of Hanoi problem
 * Three poles, one with rings on it of increasing size as you go down
 * Rings may not be placed on smaller rings
 * Only one ring may be moved to another pole at a time
 * The goal is to move all rings to a certain target pole
 * 
 * In my opinion, recursion is the easiest way to do this
 */
import java.util.Scanner;

public class TowerOfHanoi {
    public static int moves = 0;

    public static void move(int towerSize, int currentTower, int targetTower) {
        moves++;
        //System.out.println("Current:" + currentTower + " Target: "+ targetTower);
        int otherTower = (6 - currentTower - targetTower); //6 = 1 + 2 + 3

        //Base cases: Tower size is 1 or less
        if (towerSize < 1) {
            System.out.println("The stack is not high enough!");
        } else if (towerSize == 1) {
            System.out.println("Move " + currentTower + " to " + targetTower);
        } else {
            //Decrease tower size by one; getting closer to the base case
            move (towerSize - 1, currentTower, otherTower);
            System.out.println("Move " + currentTower + " to " + targetTower);
            move (towerSize - 1, otherTower, targetTower);
        }
    }

    public static void main(String[] args) {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        int towerSize, currentTower, targetTower;
        System.out.print("Enter tower size: ");
        towerSize = keyboard.nextInt();
        System.out.print("Enter current tower: ");
        currentTower = keyboard.nextInt();
        System.out.print("Enter target tower: ");
        targetTower = keyboard.nextInt();

        keyboard.close();

        move(towerSize, currentTower, targetTower);
        System.out.println("Minimum number of moves required: " + moves);        
    }
}
