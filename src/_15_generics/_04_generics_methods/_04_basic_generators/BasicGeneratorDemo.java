package _15_generics._04_generics_methods._04_basic_generators;

import _15_generics._03_generics_interface.Generator;

/**
 * @author lwx
 * @date 2019/9/1-17:33
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
            BasicGenerator.create(CountedObject.class);
        gen = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
