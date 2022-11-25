/**
 * File: Shirt.java
 * Description: This class represents an individual shirt
 */
public class Shirt {
    //Fields
    private int size;
    private String colour;
    private int yearPurchased;

    private final int CURRENT_YEAR = 2022;

    //Constructor
    public Shirt (String colour, int size, int yearPurchased) {
        this.colour = colour;
        this.size = size;
        this.yearPurchased = yearPurchased;
    }

    //Accessors
    public int getSize() {
        return size;
    }
    public String getColour() {
        return colour;
    }
    public int getYearPurchased() {
        return yearPurchased;
    }

    //Mutators
    public void setSize(int size) {
        this.size = size;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void getYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    //Methods
    /**
     * 
     * @return Age of the shirt
     */
    public int age() {
        return CURRENT_YEAR - yearPurchased;
    }

    /**
     * 
     * @param other shirt object
     * @return Shirt object with the greater size
     */
    public Shirt biggerShirt(Shirt other) {
        if (size >= other.getSize()) {
            return this;
        }
        return other;
    }

    /**
     * 
     * @param other shirt object
     * @return Shirt object with the smaller age
     */
    public Shirt newerShirt(Shirt other) {
        if (age() <= other.age()) {
            return this;
        }
        return other;
    }

    /**
     * 
     * @param other
     * @return True if the size and colour of both the implicit and explicit objects are the same, false otherwise
     */
    public boolean equals(Shirt other) {
        if (other != null && size == other.getSize() && colour.equals(other.getColour())) {
            return true;
        }
        return false;
    }

    /**
     * @return A string representation of the implicit object
     */
    public String toString() {
        return "Colour: " + colour + "\nSize: " + size + "\nYear Purchased: " + yearPurchased;
    }
}
