package _17_go_deep_in_container._09_hash_and_hashcode;

/**
 * @author wx-li
 * @date 2019/9/5-17:48
 * Looks plausible, but doesn't work as a HashMap key.
 **/
public class Groundhog {
    protected int number;
    public Groundhog(int n) {
        number = n;
    }
    public String toString() {
        return "Groundhog #" + number;
    }
}
