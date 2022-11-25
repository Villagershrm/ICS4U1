public class B extends Inheritance {
    public B() {
        System.out.print("B");
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        System.out.println();
        B b = new B();
        System.out.println();
        Inheritance c = new B();
    }
}
