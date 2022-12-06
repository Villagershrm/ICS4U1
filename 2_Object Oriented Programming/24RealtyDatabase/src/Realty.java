import java.util.Scanner;

public class Realty {
    private static void printMenu() {
        String menu = "";
        menu += "1. Load properties from a file\n";
        menu += "2. List all properties\n";
        menu += "3. List all condominiums\n";
        menu += "4. List all houses\n";
        menu += "5. Search for a property by ID\n";
        menu += "6. Search for properties by specifications\n";
        menu += "7. Print average price of all properties in the specified zone\n";
        menu += "8. Find the largest condo\n";
        menu += "9. Exit\n";

        System.out.println(menu);
    }

    public static void searchByID(Scanner keyboard, PropertyDatabase properties) {
        int id;
        System.out.print("Input the id you want to search for: ");
        id = Integer.parseInt(keyboard.nextLine());
        properties.searchByID(id);
    }

    public static void searchBySpecs(Scanner keyboard, PropertyDatabase properties) {
        int size, numBedroom;
        String propertyType, zoneCode;
        double price, percentMatch;
        char spec1, spec2, spec3, spec4, spec5;
        PrimarySpec primSpec;
        SecondarySpec secSpec;

        System.out.println("Primary specs: ");
        System.out.print("Enter a zone code: ");
        zoneCode = keyboard.nextLine();

        System.out.print("Enter a price (in CAD): $");
        price = Double.parseDouble(keyboard.nextLine());

        System.out.print("Enter a size (in square ft): ");
        size = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter the number of bedrooms you're looking for: ");
        numBedroom = Integer.parseInt(keyboard.nextLine());

        primSpec = new PrimarySpec(zoneCode, price, size, numBedroom);
        
        System.out.print("Enter the type of property you're looking for: ");
        propertyType = keyboard.nextLine();

        System.out.println();
        System.out.println("Secondary specs: ");

        if (propertyType.equals(PropertyDatabase.getTypeHouse())) {
            System.out.print("Would you like a vacuum? (Y/N): ");
            spec1 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like air conditioning? (Y/N): ");
            spec2 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like a fireplace? (Y/N): ");
            spec3 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like a hardwood floor? (Y/N): ");
            spec4 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like a finished basement? (Y/N): ");
            spec5 = keyboard.nextLine().toUpperCase().charAt(0);

            secSpec = new HouseSpec(spec1, spec2, spec3, spec4, spec5);
        } else {
            System.out.print("Would you like a pool? (Y/N): ");
            spec1 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like an exercise room? (Y/N): ");
            spec2 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like a locker? (Y/N): ");
            spec3 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like hydro to be included? (Y/N): ");
            spec4 = keyboard.nextLine().toUpperCase().charAt(0);

            System.out.print("Would you like cable to be included? (Y/N): ");
            spec5 = keyboard.nextLine().toUpperCase().charAt(0);

            secSpec = new CondoSpec(spec1, spec2, spec3, spec4, spec5);
        }

        System.out.println("What percent of your secondary specifications do you want to be satisfied?");
        percentMatch = Double.parseDouble(keyboard.nextLine());

        properties.printAllMatch(primSpec, secSpec, percentMatch);
    }

    public static void printAveragePriceInZone(Scanner keyboard, PropertyDatabase properties) {
        String zoneCode;
        System.out.print("Enter a zone code: ");
        zoneCode = keyboard.nextLine();
        System.out.println("Average price: $" + properties.averagePriceInZone(zoneCode));
    }
    public static void main(String[] args) throws Exception {
        PropertyDatabase properties = new PropertyDatabase();
        Scanner keyboard = new Scanner(System.in);

        properties.loadDatabase();

        int input = 0;

        do {
            printMenu();
            input = keyboard.nextLine().charAt(0) - '0';
            switch (input) {
                case 1: properties.loadDatabase(); break;
                case 2: properties.listProperties(); break;
                case 3: properties.listCondo(); break;
                case 4: properties.listHouse(); break;
                case 5: searchByID(keyboard, properties); break;
                case 6: searchBySpecs(keyboard, properties); break;
                case 7: printAveragePriceInZone(keyboard, properties); break;
                case 8: properties.printLargestCondo(); break;
            }
            System.out.println();
        } while (input != 9);

    }
}