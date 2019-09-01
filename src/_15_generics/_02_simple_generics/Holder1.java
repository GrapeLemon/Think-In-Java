package _15_generics._02_simple_generics;

/**
 * @author lwx
 * @date 2019/9/1-10:45
 */
class Automobile {}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }
    Automobile get() { return a;}
}
