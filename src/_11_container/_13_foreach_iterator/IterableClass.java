package _11_container._13_foreach_iterator;

import sun.usagetracker.UsageTrackerClient;

import java.util.Iterator;

/**
 * @Author wx-li
 * @Date 2019/8/29 13:28
 **/
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {
                return index < words.length;
            }
            public String next() {
                return words[index++];
            }

            public void remove() {  //Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s + " ");
        }
    }
}
