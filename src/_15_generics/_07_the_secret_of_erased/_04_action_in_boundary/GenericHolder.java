package _15_generics._07_the_secret_of_erased._04_action_in_boundary;

/**
 * @Author wx-li
 * @Date 2019/9/2 19:06
 **/
public class GenericHolder<T> {
    private T obj;
    public void set(T obj){ this.obj = obj; }
    public T get() { return obj; }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.set("Item");
        String s = holder.get();
    }
}
