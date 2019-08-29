package _11_container._10_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/29 11:11
 * Simple demonstration of HashMap
 **/
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            //Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);    //返回null则表示该数字第一次被找到
            m.put(r, freq == null ? 1 : freq + 1);  //第一次找到则初始化为1，否则在原来的基础上加1
        }
        System.out.println(m);
    }
}
