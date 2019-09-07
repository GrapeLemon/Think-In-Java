package _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._04_how_to_choose_set;

import _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework.Test;
import _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework.TestParam;
import _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework.Tester;

import java.util.*;

/**
 * @author wx-li
 * @date 2019/9/7-16:56
 * Demonstrates performance differences in Sets
 * {Args: 100 5000} Small to keep build testing short
 **/
public class SetPerformance {
    static List<Test<Set<Integer>>> tests = new ArrayList<>();
    static {
        tests.add(new Test<Set<Integer>>("add") {
            @Override
            protected int test(Set<Integer> set, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    set.clear();
                    for (int j = 0; j < size; j++) {
                        set.add(j);
                    }
                }
                return loops * size;
            }
        });
        tests.add(new Test<Set<Integer>>("contains") {
            @Override
            protected int test(Set<Integer> set, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for (int i = 0; i < loops; i++) {
                    for (int j = 0; j < span; j++) {
                        set.contains(j);
                    }
                }
                return loops * span;
            }
        });
        tests.add(new Test<Set<Integer>>("iterate") {
            @Override
            protected int test(Set<Integer> set, TestParam tp) {
                int loops = tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator<Integer> it = set.iterator();
                    it.next();
                }
                return loops * set.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<>(), tests);
        Tester.run(new HashSet<>(), tests);
        Tester.run(new LinkedHashSet<>(), tests);
    }
}
