package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:13
 **/
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);         //1
        System.out.println("++i = " + ++i);     //2
        System.out.println("i++ = " + i++);     //2
        System.out.println("i = " + i);         //3
        System.out.println("--i = " + --i);     //2
        System.out.println("i-- = " + i--);     //2
        System.out.println("i = " + i);         //1

    }
}
