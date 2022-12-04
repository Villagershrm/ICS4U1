//Abstract class to prevent instantisating properties that are neither a house nor a condo
public abstract class Property { 
    private int id;
    private String address;
    private PrimarySpec primSpec;
    private SecondarySpec secSpec;

    public Property(int id, String address, PrimarySpec primSpec, SecondarySpec secSpec) {
        this.id = id;
        this.address = address;
        this.primSpec = primSpec;
        this.secSpec = secSpec;
    }

    public PrimarySpec getPrimarySpec() {
        return primSpec;
    }

    public boolean matchProperty(PrimarySpec wantedPrimSpec, SecondarySpec wantedSecSpec, double percentMatch) {
        if (!primSpec.matchSpec(wantedPrimSpec)) {
            return false;
        }

        if (!secSpec.matchSpec(wantedSecSpec, percentMatch)) {
            return false;
        }

        return true;
    }

    public boolean checkID(int id) {
        return this.id == id;
    }

    public Property biggerProperty(Property other) {
        if (primSpec.biggerSize(other.getPrimarySpec())) {
            return other;
        }
        return this;
    }

    //ToString only returns id and address
    public String toString() {
        return "ID: " + id + "\nAddress: " + address;
    }

    public void printInfo() {
        System.out.println(toString() + "\n" + primSpec.toString() + "\n" + secSpec.toString());
    }
}
