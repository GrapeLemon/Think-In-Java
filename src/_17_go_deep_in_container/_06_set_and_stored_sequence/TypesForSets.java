package _17_go_deep_in_container._06_set_and_stored_sequence;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/9/4 14:57
 * Methods necessary to put your own type in a Set.
 **/

class SetType {
    int i;

    public SetType(int n) { this.i = n; }

    // 这个idea生成的equals也太强大了吧
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SetType)) return false;
        SetType setType = (SetType) o;
        return i == setType.i;
    }

    public String toString() {
        return Integer.toString(i);
    }

}

class HashType extends SetType {
    public HashType(int n) {
        super(n);
    }
    public int hashCode() {
        return i;
    }
}

class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType arg) {
//  return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
        return (Integer.compare(arg.i, i));
    }
}

public class TypesForSets {
    static <T> Set<T> fill(Set<T> set, Class<T> type) {
        try {
            for (int i = 0; i < 10; i++) {
                set.add(
                    type.getConstructor(int.class).newInstance(i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return set;
    }
    static <T> void test(Set<T> set, Class<T> type) {
        fill(set, type);
        fill(set, type); // Try to add duplicates
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String[] args) {
        test(new HashSet<>(), HashType.class);
        test(new LinkedHashSet<>(), HashType.class);
        test(new TreeSet<>(), TreeType.class);
        // Things that don't work:
        test(new HashSet<>(), SetType.class);
        test(new HashSet<>(), TreeType.class);
        test(new LinkedHashSet<>(), SetType.class);
        test(new LinkedHashSet<>(), TreeType.class);
        try {
            test(new TreeSet<>(), SetType.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            test(new TreeSet<>(), HashType.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
