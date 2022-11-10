public class Lab {
    //Fields
    private static int maxCapacity;
    private int computersInstalled;
    private Computer[] computers;

    //Constructor
    public Lab(int maxCapacity) {
        computers = new Computer[maxCapacity];
        setMaxCapacity(maxCapacity);
        computersInstalled = 0;
    }

    //Mutator
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    //Methods

    //I made some of the methods more robust in case one of the computers gets removed or something
    /**
     * Installs a computer at specified index
     * @param serialNumber      Serial number of the installed computer
     * @param manufacturer      Manufacturer of the installed computer
     * @param yearMade          Year the installed computer was made
     * @param yearOfPurchase    Year the installed computer was purchased
     * @param processorSpeed    The processor speed of the installed computer in GHz
     * @param ramGB             The RAM of the installed computer in GB
     * @param warrantyExpYear   Expiry year of the installed computer's warranty
     */
    public void installComputer(String serialNumber, String manufacturer, int yearMade, int yearOfPurchase, 
                                double processorSpeed, int ramGB, int warrantyExpYear) {
        if (computersInstalled >= maxCapacity) {
            System.out.println("Maximum amount of computers installed");
            return;
        }
        computers[computersInstalled] = new Computer(serialNumber, manufacturer, yearMade, yearOfPurchase, 
                                        processorSpeed, ramGB, warrantyExpYear);
        computersInstalled++;
    }

    /**
     * 
     * @return The average age of all installed computers as a Double
     */
    public double averageAge() {
        int totalAge = 0;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                totalAge += computers[i].age();
            }
        }
        return ((double) totalAge) / computersInstalled;
    }

    /**
     * @return The computer in the lab with the lowest age. Returns DEFAULT_COMPUTER if no computers exist 
     *         in the lab
     */
    public Computer newestComputer() {
        Computer current = Computer.DEFAULT_COMPUTER;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                current = computers[i].newer(current);
            }
        }

        return current; // Returns default computer if no computers exist in the lab
    }

    /**
     * @return The computer in the lab with the greatest processing speed. Returns DEFAULT_COMPUTER if 
     *         no computers exist in the lab
     */
    public Computer fastestComputer() {
        Computer current = Computer.DEFAULT_COMPUTER;
        for (int i = 0; i < maxCapacity; i++) {
            if (computers[i] != null) {
                current = computers[i].fasterComputer(current);
            }
        }

        return current; // Returns default computer if no computers exist in the lab
    }

    /**
     * @return The computer in the lab with the greatest RAM. Returns DEFAULT_COMPUTER if no computers exist 
     *          in the lab
     */
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

    /**
     * 
     * @return A Computer array that includes all computers whose warranties expire this year or next year
     */
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
