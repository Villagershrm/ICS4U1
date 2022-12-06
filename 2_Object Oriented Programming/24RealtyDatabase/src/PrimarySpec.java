public class PrimarySpec {
    private String zoneCode;
    private double price;
    private int size; //Size measured in square feet
    private int numBedroom;

    public PrimarySpec(String zoneCode, double price, int size, int numBedroom) {
        this.zoneCode = zoneCode;
        this.price = price;
        this.size = size;
        this.numBedroom = numBedroom;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public int getNumBedroom() {
        return numBedroom;
    }

    //Returns true if the implicit object satisfies the specs outlined by the explicit PrimarySpec
    //Returns false otherwise
    public boolean matchSpec(PrimarySpec other) {
        if (!zoneCode.equals(other.getZoneCode())) {
            return false;
        }
        
        if (!(price <= other.getPrice())) {
            return false;
        }

        if (!(size >= other.getSize())) {
            return false;
        }

        if (!(numBedroom >= other.getNumBedroom())) {
            return false;
        }

        return true;
    }

    //Returns true if the explicit PrimarySpec has a greater size than the implicit size
    public boolean biggerSize(PrimarySpec other) {
        return other.getSize() > size;
    }

    public boolean inZone(String zoneCode) {
        return this.zoneCode.equals(zoneCode);
    }

    public String toString() {
        return "Zone code: " + zoneCode + "\nPrice: $" + price + "\nSize: " + size + " sq ft\nBedrooms: " + numBedroom;
    }
}
