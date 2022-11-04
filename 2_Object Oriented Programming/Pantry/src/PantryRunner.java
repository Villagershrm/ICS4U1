import java.util.Scanner;

public class PantryRunner {
    public static void main(String[] args) throws Exception {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        Jam jar1 = new Jam("Strawberry", "04/11/2022", 5);
        Jam jar2 = new Jam("Blueberry", "03/11/2022", 12);
        Jam jar3 = new Jam("Raspberry", "04/11/2020", 100);
        Pantry pantry = new Pantry(jar1, jar2, jar3);
        int selectedJam, amountSpread = 0;

        System.out.println("This is my pantry. Don't touch strawberry, that's mine");
        System.out.println();

        do {
            System.out.println("The jams are: ");
            System.out.println(pantry);

            System.out.print("Enter your selection (1, 2, or 3): ");
            selectedJam = Integer.parseInt(keyboard.nextLine());

            if (selectedJam >= 1 && selectedJam <= 3) {
                System.out.print("Enter amount to spread: ");
                amountSpread = Integer.parseInt(keyboard.nextLine());
            }

            switch (selectedJam) {
                case 1:
                    pantry.spreadJam(jar1, amountSpread); 
                    break;
                case 2: 
                    pantry.spreadJam(jar2, amountSpread); 
                    break;
                case 3: 
                    pantry.spreadJam(jar3, amountSpread); 
                    break;
                case -1: 
                    break;
                default:
                    System.out.println("Invalid selection! Input -1 to exit");
            }
            System.out.println();
        } while (selectedJam != -1);

        System.out.println("Btw you owe me $100 for each fluid ounce of jam you used");
        keyboard.close();
    }
}
