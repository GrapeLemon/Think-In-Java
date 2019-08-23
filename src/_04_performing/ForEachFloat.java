package _04_performing;

import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/23 16:47
 **/
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for(float x : f){
            System.out.println(x);
        }
    }
}
