import java.util.Scanner;
import java.io.*;

public class ClosetRunner {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final int INT_SHIRTS_PURCHASED = 5;
        int maxCapacity, numberOfShirts, size, yearPurchased, sizeToCheck;
        String colour;
        Closet closet;

        System.out.print("Input the maximum capacity of the closet (in shirts): ");
        maxCapacity = Integer.parseInt(keyboard.nextLine());

        closet = new Closet(maxCapacity);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("boyShirts.txt"));
            numberOfShirts = Integer.parseInt(reader.readLine());

            //Add shirts from file
            for (int i = 0; i < numberOfShirts; i++) {
                colour = reader.readLine();
                size = Integer.parseInt(reader.readLine());
                yearPurchased = Integer.parseInt(reader.readLine());

                closet.addShirt(colour, size, yearPurchased);
            }

            //5 new shirts
            for (int i = 0; i < INT_SHIRTS_PURCHASED; i++) {
                System.out.print("Enter the colour of the shirt: ");
                colour = keyboard.nextLine();
                System.out.print("Enter the size of the shirt: ");
                size = Integer.parseInt(keyboard.nextLine());
                System.out.print("Enter the year the shirt was purchased: ");
                yearPurchased = Integer.parseInt(keyboard.nextLine());

                if (closet.isFull()) {
                    closet.removeOldestShirt();
                }

                closet.addShirt(colour, size, yearPurchased);
                System.out.println();
            }

            //Number of shirts with the size entered by the user
            System.out.print("Enter the size of a shirt you want to look for: ");
            sizeToCheck = Integer.parseInt(keyboard.nextLine());
            System.out.println("There are " + closet.numberOfShirts(sizeToCheck) + " shirts of that size in the closet.");

            System.out.println();

            //Print the info about the newest shirt
            System.out.println(closet.newestShirt());

            reader.close();
        } catch (IOException e) {
            System.out.println("Failed to read closet information");
        }

        keyboard.close();
    }
}
