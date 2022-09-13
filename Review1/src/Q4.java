/*
Wing Li
September 8, 2022
Calculates the time the user has been alive and how long they have slept for
Assume the user sleeps 8 hours per day.
Assume there are 30 days in a month and 365 days in a year.
*/
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int bYear, bMonth, bDay, cYear, cMonth, cDay, daysAlive;

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        bYear = Integer.parseInt(keyboard.nextLine());
        System.out.print("Month: ");
        bMonth = Integer.parseInt(keyboard.nextLine());
        System.out.print("Day: ");
        bDay = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        cYear = Integer.parseInt(keyboard.nextLine());
        System.out.print("Month: ");
        cMonth = Integer.parseInt(keyboard.nextLine());
        System.out.print("Day: ");
        cDay = Integer.parseInt(keyboard.nextLine());

        daysAlive = 365 * (cYear - bYear) + 30 * (cMonth - bMonth) + (cDay - bDay);
        System.out.println("You have been alive for " + daysAlive + " days.");
        System.out.println("You have slept " + (daysAlive * 8) + " hours.");

        keyboard.close();
    }
}
