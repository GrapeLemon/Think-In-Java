package _11_container._08_stack;

import javax.jws.soap.SOAPBinding;
import java.util.LinkedList;

/**
 * @Author wx-li
 * @Date 2019/8/29 10:45
 * Making a stack from a LinkedList.
 **/
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T v){storage.addFirst(v);}
    public T peek(){return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}
}
