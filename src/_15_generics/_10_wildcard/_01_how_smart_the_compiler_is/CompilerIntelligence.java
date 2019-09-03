package _15_generics._10_wildcard._01_how_smart_the_compiler_is;

import java.util.Arrays;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 13:44
 **/
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
            Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0); //No warning
        flist.contains(new Apple()); //Argument is 'Object'
        flist.indexOf(new Apple()); //Argument is 'Object'
    }
}
