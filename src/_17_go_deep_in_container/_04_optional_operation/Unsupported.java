package _17_go_deep_in_container._04_optional_operation;

import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/9/4 14:12
 * Unsupported operations in Java containers
 **/
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("---" + msg +"---");
        Collection<String> c = list;
        Collection<String> sublist = list.subList(1,8);
        // Copy of the sublist:
        Collection<String> c2 = new ArrayList<>(sublist);
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll(): " + e);
        }
        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll(): " + e);
        }
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear(): " + e);
        }
        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add(): " + e);
        }
        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll(): " + e);
        }
        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove(): " + e);
        }
        // The List.set() method modifies the value but
        // dosen't change the size of the data structure:
        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set(): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()",
            Collections.unmodifiableList(
                new ArrayList<>(list)));
    }
}

