package _15_generics._02_simple_generics._01_tuple;

import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author lwx
 * @date 2019/9/1-11:14
 */

class Amphibian{}
class Vehicle{}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        //Autoboxing converts the int to Integer:
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        // ttsi.first = "there"; // Compile error: final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }

}
