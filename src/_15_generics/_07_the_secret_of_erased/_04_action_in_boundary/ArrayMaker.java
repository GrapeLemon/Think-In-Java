package _15_generics._07_the_secret_of_erased._04_action_in_boundary;

import com.sun.org.glassfish.external.amx.AMX;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author wx-li
 * @Date 2019/9/2 17:50
 **/
public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind) { this.kind = kind; }
    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[])Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker =
            new ArrayMaker<>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}
