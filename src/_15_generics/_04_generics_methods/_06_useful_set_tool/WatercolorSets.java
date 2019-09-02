package _15_generics._04_generics_methods._06_useful_set_tool;

import java.util.EnumSet;
import java.util.Set;

/**
 * @Author wx-li
 * @Date 2019/9/2 10:45
 **/
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Sets.union(set1, set2): " + Sets.union(set1, set2));
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("Sets.intersection(set1, set2): "+ subset);
        System.out.println("Sets.difference(set1, subset): " + Sets.difference(set1, subset));
        System.out.println("Sets.difference(set2, subset): " + Sets.difference(set2, subset));
        System.out.println("Sets.complement(set1, set2): " + Sets.complement(set1, set2));
    }
}
