package _15_generics._03_generics_interface;

/**
 * @author lwx
 * @date 2019/9/1-14:51
 */
public class Coffee {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
