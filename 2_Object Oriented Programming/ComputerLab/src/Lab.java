public class Lab {
    private static int maxCapacity;
    private int computersInstalled;
    private Computer[] computers;

    public Lab(int maxCapacity) {
        computers = new Computer[maxCapacity];
        setMaxCapacity(maxCapacity);
        computersInstalled = 0;
    }

    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    public void installComputer(String serialNumber, String manufacturer, int yearMade, int yearOfPurchase, 
                                Double processorSpeed, int ramGB, int warrantyExpYear, int index) {
        if (computers[index] == null) {
            computersInstalled++; // A new computer is installed if one didn't already exist
        }
        computers[index] = new Computer(serialNumber, manufacturer, yearMade, yearOfPurchase, 
                                        processorSpeed, ramGB, warrantyExpYear);
    }

    public double averageAge() {
        int totalAge = 0;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                totalAge += computers[i].age();
            }
        }
        return ((double) totalAge) / computersInstalled;
    }

    public Computer newestComputer() {
        Computer current = Computer.DEFAULT_COMPUTER;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                current = computers[i].newer(current);
            }
        }

        return current; // Returns default computer if no computers exist in the lab
    }

    public Computer fastestComputer() {
        Computer current = Computer.DEFAULT_COMPUTER;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                current = computers[i].fasterComputer(current);
            }
        }

        return current; // Returns default computer if no computers exist in the lab
    }

    public Computer mostMemory() {
        Computer current = Computer.DEFAULT_COMPUTER;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                current = computers[i].moreMemory(current);
            }
        }

        return current; // Returns default computer if no computers exist in the lab
    }

    /**
     * @param manufacturer The manufacturer to look for
     * @return The number of computers in the lab made by this manufacturer
     */
    public int manufacturerCount(String manufacturer) {
        int count = 0;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null && computers[i].isMadeByManufacturer(manufacturer)) {
                count++;
            }
        }
        return count;
    }

    // Create a list of computers that are expiring in the next year
    //Approach: Count the number of computers whose warranty is about to expire, then go back and put
    //          the computers in the array
    public Computer[] warrantyAboutToExpire() {
        //Probably a lot easier with an ArrayList
        int count = 0;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null && computers[i].aboutToExpire()) {
                count++;
            }
        }

        Computer[] computersAboutToExpire = new Computer[count];
        count = 0;

        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null && computers[i].aboutToExpire()) {
                computersAboutToExpire[count] = computers[i];
                count++; 
            }
        }

        return computersAboutToExpire;
    }
}
