package _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._05_how_to_choose_map;

import _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework.Test;
import _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework.TestParam;
import _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework.Tester;

import java.util.*;

/**
 * @author wx-li
 * @date 2019/9/7-17:08
 * Demonstrates performance differences in Maps.
 * {Arg: 100 5000} Small to keep build testing short
 **/
public class MapPerformance {
    static List<Test<Map<Integer, Integer>>> tests = new ArrayList<>();
    static {
        tests.add(new Test<Map<Integer, Integer>>("put") {
            @Override
            protected int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    map.clear();
                    for (int j = 0; j < size; j++) {
                        map.put(i, j);
                    }
                }
                return loops * size;
            }
        });
        tests.add(new Test<Map<Integer, Integer>>("get") {
            @Override
            protected int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for (int i = 0; i < loops; i++) {
                    for (int j = 0; j < span; j++) {
                        map.get(j);
                    }
                }
                return loops * span;
            }
        });
        tests.add(new Test<Map<Integer, Integer>>("iterate") {
            @Override
            protected int test(Map<Integer, Integer> map, TestParam tp) {
                int loops =tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops * map.size();
            }
        });
    }

    public static void main(String[] args) {
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.run(new TreeMap<>(),tests);
        Tester.run(new HashMap<>(),tests);
        Tester.run(new LinkedHashMap<>(),tests);
        Tester.run(new IdentityHashMap<>(),tests);
        Tester.run(new WeakHashMap<>(),tests);
        Tester.run(new Hashtable<>(),tests);

    }
}
