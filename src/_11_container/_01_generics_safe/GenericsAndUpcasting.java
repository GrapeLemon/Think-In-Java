package _11_container._01_generics_safe;

import _09_interface._03_totallyjieou.Apply;
import com.sun.corba.se.impl.oa.poa.AOMEntry;

import java.util.ArrayList;

/**
 * @Author wx-li
 * @Date 2019/8/29 9:31
 **/
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples) {
            System.out.println(c);
        }
    }
}
