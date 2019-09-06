package _17_go_deep_in_container._09_hash_and_hashcode._03_overwrite_hashCode_method;

/**
 * @author wx-li
 * @date 2019/9/6-13:04
 **/
public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
    }
}
