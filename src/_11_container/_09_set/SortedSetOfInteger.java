package _11_container._09_set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author wx-li
 * @Date 2019/8/29 10:59
 **/
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
