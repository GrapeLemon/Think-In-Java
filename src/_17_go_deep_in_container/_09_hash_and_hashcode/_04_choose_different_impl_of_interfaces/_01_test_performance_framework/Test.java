package _17_go_deep_in_container._09_hash_and_hashcode._04_choose_different_impl_of_interfaces._01_test_performance_framework;

/**
 * @author wx-li
 * @date 2019/9/7-10:17
 **/
public abstract class Test<C> {
    String name;
    public Test(String name) {
        this.name = name;
    }

    // Override this method for different tests.
    // Returns actual number of repetitions of test.
    protected abstract int test(C container, TestParam tp);
}
