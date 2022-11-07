import java.util.Scanner;
public class BagTester {
    public static void main(String[] args) throws Exception {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        String style1, style2, label1, label2, label3, label4, colour1, colour2, colour3, colour4, addOrRemove;
        int sheets1, sheets2, sheets3, sheets4, schoolBagID, binderID = -1, sheetsToRemove;

        //Variable input
        System.out.print("Input the style of schoolbag 0: ");
        style1 = keyboard.nextLine();
        System.out.print("Input the label of binder 0: ");
        label1 = keyboard.nextLine();
        System.out.print("Input the colour of binder 0: ");
        colour1 = keyboard.nextLine();
        System.out.print("Input the number of sheets in binder 0: ");
        sheets1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Input the label of binder 1: ");
        label2 = keyboard.nextLine();
        System.out.print("Input the colour of binder 1: ");
        colour2 = keyboard.nextLine();
        System.out.print("Input the number of sheets in binder 1: ");
        sheets2 = Integer.parseInt(keyboard.nextLine());

        System.out.print("Input the style of schoolbag 1: ");
        style2 = keyboard.nextLine();
        System.out.print("Input the label of binder 0: ");
        label3 = keyboard.nextLine();
        System.out.print("Input the colour of binder 0: ");
        colour3 = keyboard.nextLine();
        System.out.print("Input the number of sheets in binder 0: ");
        sheets3 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Input the label of binder 1: ");
        label4 = keyboard.nextLine();
        System.out.print("Input the colour of binder 1: ");
        colour4 = keyboard.nextLine();
        System.out.print("Input the number of sheets in binder 1: ");
        sheets4 = Integer.parseInt(keyboard.nextLine());

        //Schoolbags
        SchoolBag[] bags = new SchoolBag[2];
        bags[0] = new SchoolBag(style1, label1, colour1, sheets1, label2, colour2, sheets2);

        Binder binder = new Binder(label3, colour3, sheets3);
        Binder binder1 = new Binder(label4, colour4, sheets4);
        bags[1] = new SchoolBag(style2, binder, binder1);
        
        //Actual testing now
        do {
            System.out.print("Please select a schoolbag (by ID, 0 or 1): ");
            schoolBagID = Integer.parseInt(keyboard.nextLine());

            if (schoolBagID != -1) {
                System.out.print("Please select a binder in schoolbag " + schoolBagID + " (by ID, 0 or 1): ");
                binderID = Integer.parseInt(keyboard.nextLine());

                if (binderID != -1) {
                    System.out.print("Add (a) or remove (r) sheets: ");
                    addOrRemove = keyboard.nextLine();

                    System.out.print("Number of sheets: ");
                    sheetsToRemove = Integer.parseInt(keyboard.nextLine());

                    switch (addOrRemove.charAt(0)) {
                        case 'a': bags[schoolBagID].addSheets(sheetsToRemove, binderID); break;
                        case 'r': bags[schoolBagID].removeSheets(sheetsToRemove, binderID); break;
                        default: System.out.println("Bro that's not an option");
                    }
                }
            }
            System.out.println();
        } while (schoolBagID != -1 && binderID != -1);

        System.out.println("SchoolBag #0");
        System.out.println(bags[0]);

        System.out.println();

        System.out.println("SchoolBag #1");
        System.out.println(bags[1]);
        keyboard.close();
    }
}
