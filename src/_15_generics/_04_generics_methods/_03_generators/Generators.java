package _15_generics._04_generics_methods._03_generators;

import _15_generics._03_generics_interface.Coffee;
import _15_generics._03_generics_interface.CoffeeGenerator;
import _15_generics._03_generics_interface.Fibonacci;
import _15_generics._03_generics_interface.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lwx
 * @date 2019/9/1-17:19
 */
public class Generators {
    public static <T>Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
            new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(
            new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fnumbers) {
            System.out.print(i + ", ");
        }
    }
}
