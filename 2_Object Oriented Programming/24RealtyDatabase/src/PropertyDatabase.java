import java.io.*;
public class PropertyDatabase {
    private int numProperty;
    private Property[] propertyList;

    //private static final double MATCH_PERCENT = 100;
    private static final String HOUSE = "house";
    private static final String CONDO = "condo";
    private static final String DATABASE_LOCATION = "data.txt";

    public PropertyDatabase() {}

    public static String getTypeHouse() {
        return HOUSE;
    }

    public static String getTypeCondo() {
        return CONDO;
    }

    public boolean loadDatabase() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(DATABASE_LOCATION));
            numProperty = Integer.parseInt(reader.readLine());

            int id, size, numBedroom;
            String propertyType, address, zoneCode;
            double price;
            char spec1, spec2, spec3, spec4, spec5;
            PrimarySpec primSpec;
            SecondarySpec secSpec;

            propertyList = new Property[numProperty];

            for (int i = 0; i < numProperty; i++) {
                reader.readLine();
                propertyType = reader.readLine();
                id = Integer.parseInt(reader.readLine());
                address = reader.readLine();
                zoneCode = reader.readLine();
                price = Double.parseDouble(reader.readLine());
                size = Integer.parseInt(reader.readLine());
                numBedroom = Integer.parseInt(reader.readLine());
                spec1 = reader.readLine().charAt(0);
                spec2 = reader.readLine().charAt(0);
                spec3 = reader.readLine().charAt(0);
                spec4 = reader.readLine().charAt(0);
                spec5 = reader.readLine().charAt(0);

                primSpec = new PrimarySpec(zoneCode, price, size, numBedroom);
                if (propertyType.equals(HOUSE)) {
                    secSpec = new HouseSpec(spec1, spec2, spec3, spec4, spec5);

                    propertyList[i] = new House(id, address, primSpec, secSpec);
                } else {
                    secSpec = new CondoSpec(spec1, spec2, spec3, spec4, spec5);

                    propertyList[i] = new Condo(id, address, primSpec, secSpec);
                }
            }

            reader.close();
            return true;
        } catch (IOException iox) {
            System.out.println("Failed to read");
            return false;
        }
    }

    //Prints the info of all properties that have the same id
    public void searchByID (int id) {
        boolean foundProperty = false;
        for (int i = 0; i < numProperty; i++) {
            if (propertyList[i].checkID(id)) {
                propertyList[i].printInfo();
                foundProperty = true;
            }
        }
        if (!foundProperty) {
            System.out.println("Failed to find property with given ID");
        }
    }

    public void printAllMatch (PrimarySpec primSpec, SecondarySpec secSpec, double percentMatch) {
        if (secSpec instanceof CondoSpec) {
            for (int i = 0; i < numProperty; i++) {
                if (propertyList[i] instanceof Condo && propertyList[i].matchProperty(primSpec, secSpec, percentMatch)) {
                    System.out.println(propertyList[i]);
                }
            }
        } else {
            for (int i = 0; i < numProperty; i++) {
                if (propertyList[i] instanceof House && propertyList[i].matchProperty(primSpec, secSpec, percentMatch)) {
                    System.out.println(propertyList[i]);
                }
            }
        }
    }

    public double averagePriceInZone (String zone) {
        int propertiesInZone = 0;
        double total = 0;
        for (int i = 0; i < numProperty; i++) {
            if (propertyList[i].getPrimarySpec().inZone(zone)) {
                total += propertyList[i].getPrimarySpec().getPrice();
                propertiesInZone++;
            }
        }
        return total / propertiesInZone;
    }

    public void printLargestCondo() {
        Property largest = null;

        for (int i = 0; i < numProperty; i++) {
            if (propertyList[i] instanceof Condo) {
                if (largest == null) {
                    largest = propertyList[i];
                } else {
                    largest = largest.biggerProperty(propertyList[i]);
                }
            }
        }
        if (largest != null) {
            largest.printInfo();
        } else {
            System.out.println("No condominiums in the database");
        }
    }

    public void listProperties() {
        for (int i = 0; i < numProperty; i++) {
            propertyList[i].printInfo();
            System.out.println();
        }
    }

    public void listCondo() {
        for (int i = 0; i < numProperty; i++) {
            if (propertyList[i] instanceof Condo) {
                propertyList[i].printInfo();
                System.out.println();
            }
        }
    }

    public void listHouse() {
        for (int i = 0; i < numProperty; i++) {
            if (propertyList[i] instanceof House) {
                propertyList[i].printInfo();
                System.out.println();
            }
        }
    }
    
}
