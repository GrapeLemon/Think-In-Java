package _15_generics._10_wildcard._01_how_smart_the_compiler_is;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/9/3 13:31
 **/
public class NonCovariantGenerics {
    //Compile Error: incompatible type:
    // List<Fruit> flist = new ArrayList<Apple>();
    // Fruit里面可能有非apple族的类型,所以Apple的List在类型上不等价于Fruit的list
}
