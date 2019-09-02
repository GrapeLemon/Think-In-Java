package _15_generics._06_make_complex_generic_types;

import _15_generics._02_simple_generics._01_tuple.Amphibian;
import _15_generics._02_simple_generics._01_tuple.FourTuple;
import _15_generics._02_simple_generics._01_tuple.TupleTest;
import _15_generics._02_simple_generics._01_tuple.Vehicle;

import java.util.ArrayList;

/**
 * @Author wx-li
 * @Date 2019/9/2 16:06
 **/
public class TupleList<A,B,C,D>
    extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tl =
            new TupleList<>();
            // 从报的错误可以发现 加<>还是有用的,表明要使用类型参数,不加这个是用不了的,用的是Object版的
            // 但是编译器会进行类型推断,所以加一个<>就行了
            // new TupleList();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        // 只有有一个量带有类型参数,其他的量都可以不写了
        for (FourTuple i : tl)
            System.out.println(i);
    }
}
