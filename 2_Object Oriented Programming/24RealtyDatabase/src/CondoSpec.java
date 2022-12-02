public class CondoSpec extends SecondarySpec {
    private static final char AVAILABLE = 'Y';
    //private static final char UNAVAILABLE = 'N';
    private char pool;
    private char exercise;
    private char locker;
    private char hydro;
    private char cable;

    public CondoSpec(char pool, char exercise, char locker, char hydro, char cable) {
        this.pool = pool;
        this.exercise = exercise;
        this.locker = locker;
        this.hydro = hydro;
        this.cable = cable;
    }

    //Accessors
    public char getPool() {
        return pool;
    }

    public char getExercise() {
        return exercise;
    }

    public char getLocker() {
        return locker;
    }

    public char getHydro() {
        return hydro;
    }

    public char getCable() {
        return cable;
    }

    //Methods
    public boolean matchSpec(SecondarySpec otherSpec, double percentMatch) {
        if (!(otherSpec instanceof CondoSpec)) {
            return false;
        }

        CondoSpec other = (CondoSpec) otherSpec;
        int wantCount = 0;
        int matchCount = 0;
        
        if (other.getPool() == AVAILABLE) {
            wantCount++;
            if (pool == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getExercise() == AVAILABLE) {
            wantCount++;
            if (exercise == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getLocker() == AVAILABLE) {
            wantCount++;
            if (getLocker() == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getHydro() == AVAILABLE) {
            wantCount++;
            if (hydro == AVAILABLE) {
                matchCount++;
            }
        }

        if (other.getCable() == AVAILABLE) {
            wantCount++;
            if (cable == AVAILABLE) {
                matchCount++;
            }
        }

        return matchCount / (1.0 * wantCount) >= percentMatch;
    }

    public String toString() {
        return "Pool: " + pool + "\nExercise: " + exercise + "\nLocker: " + locker + "\nHydro included: " + hydro + "\nCable included: " + cable;
    }
}
