package _14_type_info._02_class_object._02_generic_class_references;

/**
 * @Author wx-li
 * @Date 2019/8/31 11:06
 **/
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number
    }
}
