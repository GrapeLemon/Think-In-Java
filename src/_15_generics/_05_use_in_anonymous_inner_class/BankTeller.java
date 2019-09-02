package _15_generics._05_use_in_anonymous_inner_class;

import _15_generics._03_generics_interface.Generator;
import _15_generics._04_generics_methods._03_generators.Generators;

import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/9/2 15:51
 * A very simple band teller simulation
 **/

class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer(){}
    public String toString(){ return "Customer " + id; }
    // A method to produce Generator objects:
    
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller(){}
    public String toString(){ return "Teller " + id; }
    // A method to produce Generator objects:
    
    public static Generator<Teller> generator() {
        // 这个真的牛p了
        return Teller::new;
    }
}

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator(), 4);
        for (Customer c : line)
            serve(tellers.get(rand.nextInt(tellers.size())), c);
    }
}
