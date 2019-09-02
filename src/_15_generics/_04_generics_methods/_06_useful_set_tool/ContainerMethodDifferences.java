package _15_generics._04_generics_methods._06_useful_set_tool;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author wx-li
 * @Date 2019/9/2 10:59
 **/
public class ContainerMethodDifferences {
    static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<>();
        for(Method m : type.getMethods())
            result.add(m.getName());
        return result;
    }

    static void interfaces(Class<?> type) {
        System.out.print("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<>();
        for(Class<?> c : type.getInterfaces())
            result.add(c.getSimpleName());
        System.out.println(result + " ");
    }

    static Set<String> object = methodSet((Object.class));
    static { object.add("clone"); }
    static void difference(Class<?> superSet, Class<?> subset) {
        System.out.print(superSet.getSimpleName() + " " +
            "extends " + subset.getSimpleName() +
            ", adds : ");
        Set<String> comp = Sets.difference(
            methodSet(superSet), methodSet(subset));
        comp.removeAll(object);  //Don't show 'Object' methods
        System.out.println(comp);
        interfaces(superSet);
    }

    public static void main(String[] args) {
        System.out.println("Collection:" +
            methodSet((Collection.class)));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(Queue.class, Collection.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, HashMap.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }
}
