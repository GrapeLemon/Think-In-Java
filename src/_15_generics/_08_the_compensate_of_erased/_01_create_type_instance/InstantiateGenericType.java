package _15_generics._08_the_compensate_of_erased._01_create_type_instance;

/**
 * @Author wx-li
 * @Date 2019/9/2 19:39
 **/
class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            // 使用这种方式创建对象的类型必须提供默认(无参)构造器
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class Employee{}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }
}
