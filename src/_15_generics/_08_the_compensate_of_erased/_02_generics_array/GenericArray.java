package _15_generics._08_the_compensate_of_erased._02_generics_array;

/**
 * @Author wx-li
 * @Date 2019/9/3 9:38
 **/
public class GenericArray<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) { return array[index]; }
    //method that exposes the underlying representations:
    public T[] rep() {return array; }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        //This causes a ClassCastException:
        //Integer[] ia = gai.rep();
        Object[] oa = gai.rep();
    }
}
