package _11_container._01_generics_safe;

import _05_initAndclean.pratice.A;
import _09_interface._03_totallyjieou.Apply;

import java.util.ArrayList;

/**
 * @Author wx-li
 * @Date 2019/8/29 9:26
 **/
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //Compile-time error:
        //apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        //Using foreach:
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
