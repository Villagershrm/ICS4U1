import java.util.Scanner;
//Asks user for their birth year, then outputs their age

public class Age {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final int CURRENT_YEAR = 2022;
        int birthyear;
        
        System.out.print("Input your birth year: ");
        birthyear = Integer.parseInt(keyboard.nextLine());

        int age = CURRENT_YEAR - birthyear;

        System.out.println("Your age is " + age);
        keyboard.close();
    }
}