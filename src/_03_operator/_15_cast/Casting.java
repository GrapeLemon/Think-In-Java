package _03_operator._15_cast;

/**
 * @Author wx-li
 * @Date 2019/8/23 15:30
 **/
public class Casting {
    public static void main(String[] args) {
        int i =  200;
        long lng = (long)i;
        lng = i;    //"Widening." so cast not really required
        long lng2 = (long)200;
        lng2 = 200;
        //A "narrowing conversion"
        i = (int) lng2;   //Cast required
    }
}
