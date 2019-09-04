package _17_go_deep_in_container._02_fill_cotainers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/4 13:05
 * The Collections fill() & Collections.nCopies() methods
 **/

class StringAddress {
    private String s;
    public StringAddress(String s){ this.s = s;}
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(
            Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World"));
        System.out.println(list);
    }
}
