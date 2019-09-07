package _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._02_how_to_choose_list;

import _15_generics._03_generics_interface.Generator;
import _17_go_deep_in_container._02_fill_cotainers._01_use_generator.CollectionData;

/**
 * @author wx-li
 * @date 2019/9/7-13:25
 **/
public class Generated {
    // Fill an existing array:
    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }
    // Create a new array:
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type,
                                Generator<T> gen, int size) {
        T[] a =
                (T[])java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }
} ///:~
