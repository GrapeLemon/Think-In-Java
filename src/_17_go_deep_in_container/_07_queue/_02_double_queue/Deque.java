package _17_go_deep_in_container._07_queue._02_double_queue;

import java.util.LinkedList;

/**
 * @author wx-li
 * @date 2019/9/5-10:17
 * Creating a Deque from a LinkedList.
 **/
public class Deque<T> {
    private LinkedList<T> deque = new LinkedList<>();
    public void addFirst(T e) {
        deque.addFirst(e);
    }
    public void addLast(T e) {
        deque.addLast(e);
    }
    public T getFirst() {
        return deque.getFirst();
    }
    public T getLast() {
        return deque.getLast();
    }
    public T removeFirst() {
        return deque.removeFirst();
    }
    public T removelast() {
        return deque.removeLast();
    }
    public int size() {
        return deque.size();
    }
    public String toString() {
        return deque.toString();
    }
    // And other methods as necessary...
}
