public class Binder {
    private String label;
    private String colour;
    private int sheets;

    private static final double SHEET_WEIGHT = 5;
    private static final double BINDER_WEIGHT = 100;

    public Binder(String label, String colour, int sheets) {
        this.label = label;
        this.colour = colour; 
        this.sheets = sheets;
    }

    public void addSheets(int sheets) {
        if (this.sheets + sheets > 0) {
            this.sheets += sheets;
        } else {
            this.sheets = 0;
        }
    }

    public double weight() {
        return sheets * SHEET_WEIGHT + BINDER_WEIGHT;
    }

    /**
     * @param other
     * @return Binder which has the greater weight, or this if the two Binders have the same weight
     */
    public Binder compareWeight(Binder other) {
        if (weight() >= other.weight()) {
            return this;
        }
        return other;
    }  

    //This counts as the printing info method, right?
    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "\tLabel: " + label + "\n\tColour: " + colour + "\n\t# of sheets: " + sheets;
    }
}
