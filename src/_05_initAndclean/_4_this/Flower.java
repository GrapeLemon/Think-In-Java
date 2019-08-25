package _05_initAndclean._4_this;

/**
 * @author lwx
 * @date 2019/8/23-21:47
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

     Flower(int petalCount) {
        this.petalCount = petalCount;
        System.out.println("Constructor w/ int arg only petalCount = "
            + petalCount);

    }

     Flower(String s) {
        this.s = s;
        System.out.println("Constructor w/ String arg only s = "
                + s);
    }

     Flower(String s ,int petalCount) {
        this(petalCount);
//!        this(s); Can't call two!
        this.s = s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi",47);
        System.out.println("Default constructor (no args)");
    }

    void printPetailCount() {
//        this(11); Not inside non-constructor
        System.out.println("petalCount = " + petalCount);
        System.out.println("s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetailCount();
    }
}
