public class CondoSpec extends SecondarySpec {
    private static final double SPECS_AVAILABLE = 5.0;
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
        int matchCount = 0;
        
        if (other.getPool() == pool) {
            matchCount++;
        }

        if (other.getExercise() == exercise) {
            matchCount++;
        }

        if (other.getLocker() == locker) {
            matchCount++;
        }

        if (other.getHydro() == hydro) {
            matchCount++;
        }

        if (other.getCable() == cable) {
            matchCount++;
        }

        return matchCount / SPECS_AVAILABLE >= percentMatch / 100.0;
    }

    public String toString() {
        return "Pool: " + pool + "\nExercise: " + exercise + "\nLocker: " + locker + "\nHydro included: " + hydro + "\nCable included: " + cable;
    }
}
