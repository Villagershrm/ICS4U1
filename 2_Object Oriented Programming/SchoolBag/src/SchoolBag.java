public class SchoolBag {
    private String style;
    private Binder[] binders = new Binder[2]; //Used this a bit early but this is so much more convenient

    private static final double EMPTY_BAG_WEIGHT = 2000;

    public SchoolBag(String style, Binder binder1, Binder binder2) {
        this.style = style;
        binders[0] = binder1;
        binders[1] = binder2;
    }

    public SchoolBag(String style, String label1, String colour1, int sheets1, 
                     String label2, String colour2, int sheets2) {
        this.style = style;
        binders[0] = new Binder(label1, colour1, sheets1);
        binders[1] = new Binder(label2, colour2, sheets2);
    }

    public void addSheets(int sheets, int binderNumber) {
        try {
            binders[binderNumber].addSheets(sheets);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid binder ID");
        }
    }

    public void removeSheets(int sheets, int binderNumber) {
        addSheets(-1 * sheets, binderNumber);
    }

    public double averageBinderWeight() {
        return (binders[0].weight() + binders[1].weight()) / 2.0;
    }

    public double schoolBagWeight() {
        return (binders[0].weight() + binders[1].weight()) + EMPTY_BAG_WEIGHT;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "Style: " + style + "\nBinder #0: " + "\n" + binders[0] + "\nBinder #1: " + "\n" + binders[1];
    }
}
