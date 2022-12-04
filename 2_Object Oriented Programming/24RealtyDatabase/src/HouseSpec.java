public class HouseSpec extends SecondarySpec{
    private static final double SPECS_AVAILABLE = 5.0;

    private char vacuum;
    private char airCon;
    private char fireplace;
    private char hardwoodFloor;
    private char finishedBasement;

    public HouseSpec(char vacuum, char airCon, char fireplace, char hardwoodFloor, char finishedBasement) {
        this.vacuum = vacuum;
        this.airCon = airCon;
        this.fireplace = fireplace;
        this.hardwoodFloor = hardwoodFloor;
        this.finishedBasement = finishedBasement;
    }

    public char getVacuum() {
        return vacuum;
    }

    public char getAirCon() {
        return airCon;
    }

    public char getFireplace() {
        return fireplace;
    }

    public char getHardwoodFloor() {
        return hardwoodFloor;
    }

    public char getFinishedBasement() {
        return finishedBasement;
    }

    //Methods

    //Returns true if the specs match or include more than what is demanded at a rate of the percentmatch
    public boolean matchSpec(SecondarySpec otherSpec, double percentMatch) {
        if (!(otherSpec instanceof HouseSpec)) {
            return false;
        }

        HouseSpec other = (HouseSpec) otherSpec;
        int matchCount = 0;
        
        if (other.getVacuum() == vacuum) {
            matchCount++;
        }

        if (other.getAirCon() == airCon) {
            matchCount++;
        }

        if (other.getFireplace() == fireplace) {
            matchCount++;
        }

        if (other.getHardwoodFloor() == hardwoodFloor) {
            matchCount++;
        }

        if (other.getFinishedBasement() == finishedBasement) {
            matchCount++;
        }

        return matchCount / SPECS_AVAILABLE >= percentMatch / 100.0;
    }

    public String toString() {
        return "Vacuum: " + vacuum + "\nAir conditioning: " + airCon + "\nFireplace: " + fireplace
                + "\nHardwood floor: " + hardwoodFloor + "\nFinished basement: " + finishedBasement;
    }
}
