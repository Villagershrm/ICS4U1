public class Property {
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

    public int getId() {
        return id;
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

    //ToString only returns id and address
    public String toString() {
        return "ID: " + id + "\nAddress: " + address;
    }

    public void printInfo() {
        System.out.println(toString() + "\n" + primSpec.toString() + "\n" + secSpec.toString());
    }
}
