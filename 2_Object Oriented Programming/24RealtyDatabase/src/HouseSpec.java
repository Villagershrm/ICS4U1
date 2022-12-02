public class HouseSpec extends SecondarySpec{
    private static final char AVAILABLE = 'Y';

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
        int wantCount = 0;
        int matchCount = 0;
        
        if (other.getVacuum() == AVAILABLE) {
            wantCount++;
            if (vacuum == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getAirCon() == AVAILABLE) {
            wantCount++;
            if (airCon == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getFireplace() == AVAILABLE) {
            wantCount++;
            if (fireplace == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getHardwoodFloor() == AVAILABLE) {
            wantCount++;
            if (hardwoodFloor == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getFinishedBasement() == AVAILABLE) {
            wantCount++;
            if (finishedBasement == AVAILABLE) {
                matchCount++;
            }
        }

        return matchCount / (1.0 * wantCount) >= percentMatch;
    }

    public String toString() {
        return "Vacuum: " + vacuum + "\nAir conditioning: " + airCon + "\nFireplace: " + fireplace
                + "\nHardwood floor: " + hardwoodFloor + "\nFinished basement: " + finishedBasement;
    }
}
