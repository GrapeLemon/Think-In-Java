package _03_operator;

import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:30
 **/
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("(i > j) is :  " + (i > j));
        System.out.println("(i < j) is :  " + (i < j));
        System.out.println("(i >= j) is :  " + (i >= j));
        System.out.println("(i <= j) is :  " + (i <= j));
        System.out.println("(i == j) is :  " + (i == j));
        System.out.println("(i != j) is :  " + (i != j));
    }
}
