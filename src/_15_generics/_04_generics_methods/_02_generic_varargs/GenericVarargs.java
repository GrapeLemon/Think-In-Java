package _15_generics._04_generics_methods._02_generic_varargs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwx
 * @date 2019/9/1-17:13
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        // 其实这样写就相当于每一个字符就是一个元素了
        ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
