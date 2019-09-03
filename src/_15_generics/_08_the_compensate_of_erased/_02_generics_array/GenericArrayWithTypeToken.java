package _15_generics._08_the_compensate_of_erased._02_generics_array;

import java.lang.reflect.Array;

/**
 * @Author wx-li
 * @Date 2019/9/3 9:59
 **/
public class GenericArrayWithTypeToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type,sz);
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) {
        return array[index];
    }
    // Expose the underlying representation
    // 翻译:暴露底层的实现
    public T[] rep() { return array; }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai =
            new GenericArrayWithTypeToken<>(Integer.class, 10);
        // This now work:
        Integer[] ia = gai.rep();
    }
}
