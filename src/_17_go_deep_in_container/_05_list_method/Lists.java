package _17_go_deep_in_container._05_list_method;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author wx-li
 * @Date 2019/9/4 14:42
 * Thing you can do with Lists.
 **/
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;
    public static void basicTest(List<String> a) {
        a.add(1, "x"); // Add at location 1
        a.add("x"); // Add at end
    }
}
