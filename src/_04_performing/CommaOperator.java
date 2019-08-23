package _04_performing;

import java.io.IOException;

/**
 * @Author wx-li
 * @Date 2019/8/23 16:37
 **/
public class CommaOperator {
    public static void main(String[] args) throws IOException {
        for (int i = 1, j = i + 10; i < 5; i++,j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
