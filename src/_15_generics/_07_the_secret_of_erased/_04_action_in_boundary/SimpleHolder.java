package _15_generics._07_the_secret_of_erased._04_action_in_boundary;

/**
 * @Author wx-li
 * @Date 2019/9/2 19:03
 **/
public class SimpleHolder {
    private Object obj;
    public void set(Object obj){ this.obj = obj; }
    public Object get() { return obj; }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
    }
}
