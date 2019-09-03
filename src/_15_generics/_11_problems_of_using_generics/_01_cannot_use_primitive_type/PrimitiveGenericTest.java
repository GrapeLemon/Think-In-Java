package _15_generics._11_problems_of_using_generics._01_cannot_use_primitive_type;

import _15_generics._03_generics_interface.Generator;

/**
 * @Author wx-li
 * @Date 2019/9/3 15:40
 **/

// Fill an array using a generator:
class FArray {
    public static <T> T[] fill(T[] a, Generator<T> gen) {
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.next();
        }
        return a;
    }
}

public class PrimitiveGenericTest {
    public static void main(String[] args) {
    }
}
