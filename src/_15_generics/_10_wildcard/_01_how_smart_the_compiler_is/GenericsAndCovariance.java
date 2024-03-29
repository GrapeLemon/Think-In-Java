package _15_generics._10_wildcard._01_how_smart_the_compiler_is;

import _15_generics._10_wildcard.Apple;
import _15_generics._10_wildcard.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 13:34
 **/
public class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());
        flist.add(null); //  Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
}
