package _15_generics._10_wildcard._02_super_type_wildcards;

import _15_generics._10_wildcard.Apple;
import _15_generics._10_wildcard.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 14:12
 **/
public class GenericWriting {
    static <T> void
    writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruit = new ArrayList<>();
    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Apple()); //奇怪的是作者说这里是不允许的,但是却可行
    }
    static <T> void
    writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }
    static void f2() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
