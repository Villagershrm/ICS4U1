/**
 * File: Computer.java
 * Description: This class represents an individual computer
 */ 
public class Computer {
    //Instance fields
    private String serialNumber;
    private String manufacturer;
    private int yearMade;
    private int yearOfPurchase;
    private double processorSpeed;
    private int ramGB;
    private int warrantyExpYear;

    //Class fields
    private static final int CURRENT_YEAR = 2022;
    private static final int ABOUT_TO_EXPIRE_YEARS = 1;
    public static final String DEFAULT_SERIAL_NUMBER = "";
    public static final String DEFAULT_MANUFACTURER = "N/A";
    public static final int DEFAULT_YEAR_MADE = 0;
    public static final int DEFAULT_YEAR_PURCHASED = 0;
    public static final double DEFAULT_PROCESSOR_SPEED = 0.0;
    public static final int DEFAULT_RAM = 0;
    public static final int DEFAULT_WARRANTY_EXPIRY = 0;

    public static final Computer DEFAULT_COMPUTER = new Computer(Computer.DEFAULT_SERIAL_NUMBER, 
    Computer.DEFAULT_MANUFACTURER, Computer.DEFAULT_YEAR_MADE, Computer.DEFAULT_YEAR_PURCHASED, 
    Computer.DEFAULT_PROCESSOR_SPEED, Computer.DEFAULT_RAM, Computer.DEFAULT_WARRANTY_EXPIRY);

    //Constructor
    public Computer(String serialNumber, String manufacturer, int yearMade, int yearOfPurchase, double processorSpeed
                    , int ramGB, int warrantyExpYear) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.yearMade = yearMade;
        this.yearOfPurchase = yearOfPurchase;
        this.processorSpeed = processorSpeed;
        this.ramGB = ramGB;
        this.warrantyExpYear = warrantyExpYear;
    }

    //Mutators
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }
    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }
    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }
    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }
    public void setWarrantyExpYear(int warrantyExpYear) {
        this.warrantyExpYear = warrantyExpYear;
    }
    
    //Accessors
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getYearMade() {
        return yearMade;
    }
    public int getYearOfPurchase() {
        return yearOfPurchase;
    }
    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public int getRam() {
        return ramGB;
    }
    public int getWarrantyExpYear() {
        return warrantyExpYear;
    }

    //Methods
    /**
     * 
     * @param other Another computer
     * @return The computer with the greater processor speed
     */
    public Computer fasterComputer(Computer other) {
        if (processorSpeed >= other.getProcessorSpeed()) {
            return this;
        }
        return other;
    }

    /**
     * 
     * @param other Another computer
     * @return The computer with greater memory
     */
    public Computer moreMemory(Computer other) {
        if (ramGB >= other.getRam()) {
            return this;
        }
        return other;
    }

    /**
     * 
     * @param other Another computer
     * @return The computer with the lower warranty expiration year
     */
    public Computer warrantyExpiresSooner(Computer other) {
        if (warrantyExpYear <= other.getWarrantyExpYear()) {
            return this;
        }
        return other;
    }

    /**
     * 
     * @param other Another computer
     * @return The computer with the higher year made
     */
    public Computer newer(Computer other) {
        if (yearMade >= other.getYearMade()) {
            return this;
        }
        return other;
    }

    /**
     * 
     * @param manufacturer The manufacturer to look for
     * @return True if manufacturer is the same as the implicit object's manufacturer, false otherwise
     */
    public boolean isMadeByManufacturer(String manufacturer) {
        if (this.manufacturer.equalsIgnoreCase(manufacturer)) {
            return true;
        }
        return false;
    }

    /**
     * 
     * @return Age of the implicit object
     */
    public int age() {
        return CURRENT_YEAR - yearMade;
    }

    /**
     * 
     * @return True if the computer's warranty is expiring within ABOUT_TO_EXPIRE_YEARS years, false otherwise
     */
    public boolean aboutToExpire() {
        return CURRENT_YEAR - warrantyExpYear <= ABOUT_TO_EXPIRE_YEARS;
    }

    /**
     * @return A string representation of the implicit object
     */
    public String toString() {
        String specs = "";
        specs += "Serial Number: " + serialNumber + "\n";
        specs += "Manufacturer: " + manufacturer + "\n";
        specs += "Year made: " + yearMade + "\n";
        specs += "Year of purchase: " + yearOfPurchase + "\n";
        specs += "Processor Speed: " + processorSpeed + "\n";
        specs += "RAM: " + ramGB + " gigabytes\n";
        specs += "Warranty expiration year: " + warrantyExpYear;
        return specs;
    }
}