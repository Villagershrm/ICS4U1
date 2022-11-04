//import java.util.Date;

public class Jam {
    //Fields
    private String content;
    private String dateCanned;
    private int sizeOZ;

    //Constructors
    public Jam() {
        content = "nothing";
        dateCanned = "unknown";
        sizeOZ = 0;
    }

    public Jam(String content, String dateCanned, int sizeOZ) {
        this.content = content;
        this.dateCanned = dateCanned;
        this.sizeOZ = sizeOZ;
    }

    //No accessors or mutators

    //Methods
    public boolean isEmpty() {
        return sizeOZ == 0;
    }

    public void useJam(int ozUsed) {
        if (ozUsed >= sizeOZ) {
            System.out.print(sizeOZ);
            sizeOZ = 0;
        } else {
            sizeOZ -= ozUsed;
            System.out.print(ozUsed);
        }
        System.out.println(" oz of " + content + " jam was used");
    }

    public String toString() {
        return content + "\t" + dateCanned + "\t" + sizeOZ + " fl. oz.";
    }
}
