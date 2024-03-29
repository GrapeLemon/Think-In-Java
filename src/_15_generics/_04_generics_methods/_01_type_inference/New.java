package _15_generics._04_generics_methods._01_type_inference;

import java.util.*;

/**
 * @author lwx
 * @date 2019/9/1-16:53
 * utilities to simplify generic container creation
 * by using type argument inference.
 */
public class New {
    public static <K,V> Map<K,V> map() {
        return new HashMap<>();
    }
    public static <T> List<T> list() {
        return new ArrayList<>();
    }
    public static <T> LinkedList<T> llist() {
        return new LinkedList<>();
    }
    public static <T> Set<T> set() {
        return new HashSet<>();
    }
    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }
    //Examples:
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.llist();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();
    }
}
