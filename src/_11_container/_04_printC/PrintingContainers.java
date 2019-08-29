package _11_container._04_printC;

import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/8/29 10:22
 * Containers print themselves automatically.
 **/
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()) );
        System.out.println(fill(new LinkedList<String>()) );
        System.out.println(fill(new HashSet<String>()) );
        System.out.println(fill(new TreeSet<String>()) );
        System.out.println(fill(new LinkedHashSet<String>()) );
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new LinkedHashMap<>()));

    }
}
