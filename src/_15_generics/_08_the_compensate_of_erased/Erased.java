package _15_generics._08_the_compensate_of_erased;

import org.omg.CORBA.Object;

/**
 * @Author wx-li
 * @Date 2019/9/2 19:16
 **/
public class Erased<T> {
    private static final int SIZE = 100;
    public static void f(Object arg) {
        // if(arg instanceof T){}              // Error
        // T var = new T();                    // Error
        // T[] array = new T[SIZE];            // Error
        // T[] array = (T)new Object[SIZE];     // Unchecked warning
    }
}
