public class Pantry {
    //Fields
    //Pantries have 3 jars of jam
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;

    //Constructors
    public Pantry(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
    }

    //No accessors or mutators
    
    //Methods
    public void spreadJam(Jam jar, int oz) {
        if (!jar.isEmpty()) {
            jar.useJam(oz);
        } else {
            System.out.println("No jam in the jar!");
        }
    }

    public String toString() {
        return "1:" + jar1.toString() + "\n2:" + jar2.toString() + "\n3:" + jar3.toString();
    }
}
