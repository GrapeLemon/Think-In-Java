package _11_container._09_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author wx-li
 * @Date 2019/8/29 10:55
 **/
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
