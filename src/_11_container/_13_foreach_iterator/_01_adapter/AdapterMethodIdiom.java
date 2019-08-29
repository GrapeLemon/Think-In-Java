package _11_container._13_foreach_iterator._01_adapter;

import _05_initAndclean.pratice.A;

import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/8/29 13:46
 * The "Adapter Method" idiom allows you to use foreach
 * with additional kinds of Iterables
 **/
class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator(){
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public T next() {
                        return get(current--);
                    }
                    public void remove() {  //Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        //Grabs the ordinary iterator via interator():
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        //Hand it the Iterable of your choice
        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }
}
