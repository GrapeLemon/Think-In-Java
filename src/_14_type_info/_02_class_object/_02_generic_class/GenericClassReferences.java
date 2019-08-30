package _14_type_info._02_class_object._02_generic_class;

/**
 * @author lwx
 * @date 2019/8/30-22:44
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;    //Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
}
