package _03_operator.practice;

/**
 * @Author wx-li
 * @Date 2019/8/23 15:55
 * 字符串又和普通的类有不同...
 **/
public class TestEquals {
    static void compare(String s1,String s2){
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 != s2 : " + (s1 != s2));
        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        compare(s1, s2);    //true,false,true
    }
}
