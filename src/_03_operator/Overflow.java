package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 15:53
 **/
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
