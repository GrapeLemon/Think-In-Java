package _11_container._13_foreach_iterator;

import java.util.Map;

/**
 * @Author wx-li
 * @Date 2019/8/29 13:34
 **/
public class EnvironmentVariables {
    public static void main(String[] args) {
        //System.getenv() 返回一个 Map，entrySet()产生一个由Map.Entry的元素构成的Set，并且这个Set是一个Iterable,
        //因此它可以用于foreach循环.
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
