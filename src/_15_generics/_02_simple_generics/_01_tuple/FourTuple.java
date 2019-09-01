package _15_generics._02_simple_generics._01_tuple;

/**
 * @author lwx
 * @date 2019/9/1-11:08
 */
public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C>{
    public final D fourth;
    public FourTuple(A a, B b, C c,D d) {
        super(a, b, c);
        fourth = d;
    }

    @Override
    public String toString() {
        return "(" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ")";
    }
}
