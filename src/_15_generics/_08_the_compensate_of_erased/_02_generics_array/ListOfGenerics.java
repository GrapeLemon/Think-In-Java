package _15_generics._08_the_compensate_of_erased._02_generics_array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 9:21
 **/
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }
}
