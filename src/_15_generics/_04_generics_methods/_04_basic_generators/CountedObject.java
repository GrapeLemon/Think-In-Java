package _15_generics._04_generics_methods._04_basic_generators;

/**
 * @author lwx
 * @date 2019/9/1-17:32
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id(){return id;}
    public String toString() {
        return "CountedObject " + id;
    }
}
