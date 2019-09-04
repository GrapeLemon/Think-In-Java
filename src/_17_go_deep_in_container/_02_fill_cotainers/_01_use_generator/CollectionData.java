package _17_go_deep_in_container._02_fill_cotainers._01_use_generator;

import _15_generics._03_generics_interface.Generator;

import java.util.ArrayList;

/**
 * @Author wx-li
 * @Date 2019/9/4 13:16
 **/
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    //A generic convenience method:
    public static <T> CollectionData<T>
    list(Generator<T> gen, int quantity) {
        return new CollectionData<>(gen, quantity);
    }

}
