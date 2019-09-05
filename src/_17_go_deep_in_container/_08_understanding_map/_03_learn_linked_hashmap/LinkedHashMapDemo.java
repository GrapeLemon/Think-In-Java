package _17_go_deep_in_container._08_understanding_map._03_learn_linked_hashmap;

import _17_go_deep_in_container._08_understanding_map.CountingMapData;

import java.util.LinkedHashMap;

/**
 * @author wx-li
 * @date 2019/9/5-17:36
 * What you can do with a LinkedHashMap
 **/
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap =
            new LinkedHashMap<>(new CountingMapData(9));
        System.out.println(linkedMap);
        // Least-recently-used order:
        linkedMap =
            new LinkedHashMap<>(16, 0.75f, true);
        linkedMap.putAll(new CountingMapData(9));
        System.out.println(linkedMap);
        for (int i = 0; i < 6; i++) {
            linkedMap.get(i);
        }
        System.out.println(linkedMap);
        linkedMap.get(0);
        System.out.println(linkedMap);
    }
}
