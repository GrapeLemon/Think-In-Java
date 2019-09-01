package _15_generics._04_generics_methods._04_basic_generators;

import _15_generics._03_generics_interface.Generator;

/**
 * @author lwx
 * @date 2019/9/1-17:27
 * Automatically create a Generator, given a class
 * with a default (no-arg) constructor
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            // Assumes type is a public class:
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Produce a Default generator given a type token:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }
}
