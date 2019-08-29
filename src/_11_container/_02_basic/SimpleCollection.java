package _11_container._02_basic;

import _05_initAndclean.pratice.A;
import _10_innerclass._09_inherit.InheritInner;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author wx-li
 * @Date 2019/8/29 9:39
 **/
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);   //Autoboxing
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
