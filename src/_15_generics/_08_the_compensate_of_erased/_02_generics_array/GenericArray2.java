package _15_generics._08_the_compensate_of_erased._02_generics_array;


/**
 * @Author wx-li
 * @Date 2019/9/3 9:49
 **/
public class GenericArray2<T> {
    private Object[] array;
    public GenericArray2(int sz) {
        array = new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }
    @SuppressWarnings("unchecked")
    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gai = new GenericArray2<>(10);
        for (int i = 0; i < 10; i++) {
            gai.put(i,i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(gai.get(i) + " ");
        }
        System.out.println();
        try {
            // 算是理解到了,可以这样理解:
            // 编译前是替换了的,所以类型检查才起的作用
            // 编译后是擦除了的,所以任何试图在运行时用
            // 泛型来做事都会报错(通常是类型转换异常),因为<T>被擦除而 T 被转换为Object
            Integer[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
