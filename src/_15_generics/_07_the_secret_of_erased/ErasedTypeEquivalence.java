package _15_generics._07_the_secret_of_erased;

import java.util.ArrayList;

/**
 * @Author wx-li
 * @Date 2019/9/2 16:49
 **/
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
