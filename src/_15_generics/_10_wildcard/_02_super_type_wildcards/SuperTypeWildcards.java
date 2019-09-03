package _15_generics._10_wildcard._02_super_type_wildcards;
import _15_generics._10_wildcard.Apple;
import _15_generics._10_wildcard.Fruit;
import _15_generics._10_wildcard.Jonathan;
import java.util.List;
/**
 * @Author wx-li
 * @Date 2019/9/3 14:08
 **/
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }
}
