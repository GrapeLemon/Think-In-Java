package _17_go_deep_in_container._09_hash_and_hashcode;

/**
 * @author wx-li
 * @date 2019/9/5-18:31
 * A class that's used as a key in a HashMapo
 * must override hashCode() and equals().
 **/
public class Groundhog2 extends Groundhog{
    public Groundhog2(int n) {
        super(n);
    }
    public int hashCode() {
        return number;
    }
    public boolean equals(Object o) {
        return o instanceof Groundhog2 &&
            (number == ((Groundhog2) o).number);
    }
}
