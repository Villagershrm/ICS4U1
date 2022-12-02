import java.io.*;
public class PropertyDatabase {
    private int numProperty;
    private Property[] propertyList;

    //TODO: This cringe file reading
    public PropertyDatabase(String databaseLocation) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(databaseLocation));
            numProperty = Integer.parseInt(reader.readLine());



            reader.close();
        } catch (IOException iox) {
            System.out.println("Failed to read");
        }
    }

    public Property searchByID (int id) {
        for (int i = 0; i < numProperty; i++) {
            if (propertyList[i].getId() == id) {
                return propertyList[i];
            }
        }
        return null;
    }

    public void printAllMatch (PrimarySpec primSpec, SecondarySpec secSpec) {
        for (int i = 0; i < numProperty; i++) {

        }
    }

    public double averagePriceInZone (String zone) {
        return -1;
    }

    public Condo largestCondo() {
        return null;
    }
    
}
