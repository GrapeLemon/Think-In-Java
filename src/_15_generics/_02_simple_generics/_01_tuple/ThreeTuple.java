package _15_generics._02_simple_generics._01_tuple;

/**
 * @author lwx
 * @date 2019/9/1-11:03
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    @Override
    public String toString() {
        return "(" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ")";
    }
}
