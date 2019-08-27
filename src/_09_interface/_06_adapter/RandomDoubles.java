package _09_interface._06_adapter;

import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/27 16:07
 **/
public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next(){return rand.nextDouble();}

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.print(rd.next() + " ");
        }
    }
}
