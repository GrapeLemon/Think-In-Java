package _14_type_info._02_class_object._02_generic_class;

/**
 * @author lwx
 * @date 2019/8/30-22:47
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
