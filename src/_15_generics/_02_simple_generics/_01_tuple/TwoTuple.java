package _15_generics._02_simple_generics._01_tuple;

/**
 * @author lwx
 * @date 2019/9/1-11:00
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" +
                "first=" + first +
                ", second=" + second +
                ")";
    }
}
