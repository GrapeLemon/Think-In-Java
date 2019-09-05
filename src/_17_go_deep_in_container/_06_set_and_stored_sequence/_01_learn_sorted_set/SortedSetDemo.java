package _17_go_deep_in_container._06_set_and_stored_sequence._01_learn_sorted_set;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author lwx
 * @date 2019/9/4-22:07
 * What you can do with a TreeSet.
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet,
            "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if(i == 3) low = it.next();
            if(i == 6) high = it.next();
            else it.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedSet.subSet(low, high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));
    }
}
