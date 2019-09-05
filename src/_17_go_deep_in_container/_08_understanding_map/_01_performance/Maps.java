package _17_go_deep_in_container._08_understanding_map._01_performance;

import java.util.Map;

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
    }
}
