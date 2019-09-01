package _15_generics._02_simple_generics._01_tuple;

/**
 * @author lwx
 * @date 2019/9/1-11:10
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D>{
    public final E fifth;
    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    @Override
    public String toString() {
        return "(" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ")";
    }
}
