package _17_go_deep_in_container._08_understanding_map._01_performance;

import _17_go_deep_in_container._08_understanding_map.CountingMapData;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wx-li
 * @date 2019/9/5-15:44
 * Things you can do with Maps
 **/
public class Maps {
    public static void printKeys(Map<Integer,String> map) {
        System.out.print("Size = " + map.size() + ", ");
        System.out.print("Keys: ");
        System.out.println(map.keySet());   // Produce a Set of the keys
    }
    public static void test(Map<Integer,String> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        // Map has 'Set' behavior for keys:
        map.putAll(new CountingMapData(25));
        printKeys(map);
        // Producing a Collection of the values:
        System.out.print("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11) = " + map.containsKey(11));
        System.out.println("map.get(11) = " + map.get(11));
        System.out.println("map.containsValue(\"F0\") = " + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map: " + key);
        map.remove(key);
        printKeys(map);
        map.clear();
        System.out.println("map.isEmpty() = " + map.isEmpty());
        map.putAll(new CountingMapData(25));
        // Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }

    public static void main(String[] args) {
        test(new HashMap<>());
        test(new TreeMap<>());
        test(new LinkedHashMap<>());
        test(new IdentityHashMap<>());
        test(new ConcurrentHashMap<>());
        test(new WeakHashMap<>());
    }
}
