package _11_container._13_foreach_iterator;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author wx-li
 * @Date 2019/8/29 13:25
 * All Collections work with foreach
 **/
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs) {
            System.out.println("" + s + "");
        }
    }
}
