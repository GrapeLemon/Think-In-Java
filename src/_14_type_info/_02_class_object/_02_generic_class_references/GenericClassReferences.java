package _14_type_info._02_class_object._02_generic_class_references;

/**
 * @Author wx-li
 * @Date 2019/8/31 11:02
 **/
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;    // Same thing
        intClass = double.class;
        // genericIntClass = double.class;   // Illegal
    }
}
