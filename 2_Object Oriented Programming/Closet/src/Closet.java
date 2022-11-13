public class Closet {
    //Fields
    private int maxShirts;
    private int numberOfShirts;
    private Shirt[] shirts;

    //Constructors
    public Closet(int maxShirts) {
        this.maxShirts = maxShirts;
        numberOfShirts = 0;
        shirts = new Shirt[maxShirts];
    }

    //No accessors or mutators

    //Methods
    public boolean addShirt(String colour, int size, int yearPurchased) {
        if (numberOfShirts < maxShirts) {
            shirts[numberOfShirts] = new Shirt(colour, size, yearPurchased);
            numberOfShirts++;
            return true;
        }
        return false;
    }

    private int oldestShirtIndex() {
        if (numberOfShirts == 0) {
            return -1;
        }
        int oldestShirtAge = shirts[0].age();
        int oldestShirtIndex = 0;
        for (int i = 1; i < numberOfShirts; i++) {
            if (oldestShirtAge < shirts[i].age()) {
                oldestShirtAge = shirts[i].age();
                oldestShirtIndex = i;
            }
        }
        return oldestShirtIndex;
    }

    public boolean removeOldestShirt() {
        int index = oldestShirtIndex();
        if (index == -1) {
            return false;
        }
        for (int i = index + 1; i < numberOfShirts - 1; i++) {
            shirts[index] = shirts[index + 1];
            numberOfShirts--; 
        }
        //shirts[numberOfShirts] = null; //Not sure if this is necessary
        return true;
    }

    public int numberOfShirts(int size) {
        int count = 0;
        for (int i = 0; i < numberOfShirts; i++) {
            if (size == shirts[i].getSize()) {
                count++;
            }
        }
        return count;
    }

    public Shirt newestShirt() {
        Shirt current = shirts[0];
        for (int i = 1; i < numberOfShirts; i++) {
            current = current.newerShirt(shirts[i]);
        }
        return current;
    }

    public boolean isFull() {
        return numberOfShirts == maxShirts;
    }
}
