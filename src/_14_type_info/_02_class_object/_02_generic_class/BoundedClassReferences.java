package _14_type_info._02_class_object._02_generic_class;

/**
 * @author lwx
 * @date 2019/8/30-22:49
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        //Or anything else derived from Number
    }
}
