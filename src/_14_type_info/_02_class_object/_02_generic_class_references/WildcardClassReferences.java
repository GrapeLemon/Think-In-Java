package _14_type_info._02_class_object._02_generic_class_references;

/**
 * @Author wx-li
 * @Date 2019/8/31 11:05
 **/
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
