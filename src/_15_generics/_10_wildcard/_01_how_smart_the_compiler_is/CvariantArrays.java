package _15_generics._10_wildcard._01_how_smart_the_compiler_is;
import _15_generics._10_wildcard.Apple;
import _15_generics._10_wildcard.Fruit;
import _15_generics._10_wildcard.Jonathan;
import _15_generics._10_wildcard.Orange;

/**
 * @Author wx-li
 * @Date 2019/9/3 13:22
 **/
public class CvariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        // Runtime type is Apple[], not Fruit[]  or Orange[]
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            fruit[0] = new Orange();  // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
