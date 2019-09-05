package _17_go_deep_in_container._08_understanding_map._02_learn_sorted_map;

import _17_go_deep_in_container._08_understanding_map.CountingMapData;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author wx-li
 * @date 2019/9/5-15:52
 * What you can do with a TreeMap.
 **/
public class SortedMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> sortedMap =
            new TreeMap<>(new CountingMapData(10));
        System.out.println(sortedMap);
        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        System.out.println(low);
        System.out.println(high);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = it.next();
            if (i == 6) high = it.next();
            else it.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedMap.subMap(low,high));
        // 点进去看发现有个inclusive参数,决定是否包含头部or尾部
        // 现在的处理是只包含头不包含尾
        System.out.println(sortedMap.headMap(high));
        System.out.println(sortedMap.tailMap(low));
    }
}
