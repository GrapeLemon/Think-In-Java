package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:18
 **/
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println("n1 == n2 : " + (n1 == n2));     //false
        System.out.println("n1 != n2 : " + (n1 != n2));     //true
    }
}
