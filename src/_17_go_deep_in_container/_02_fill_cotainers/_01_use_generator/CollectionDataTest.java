package _17_go_deep_in_container._02_fill_cotainers._01_use_generator;

import _15_generics._03_generics_interface.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author wx-li
 * @Date 2019/9/4 13:20
 **/
class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds " +
        "distributing swords is no basic for a system of " +
        "government").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(
            new CollectionData<String>(new Government(), 15));
        // Using the convenience method:
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);

    }
}
