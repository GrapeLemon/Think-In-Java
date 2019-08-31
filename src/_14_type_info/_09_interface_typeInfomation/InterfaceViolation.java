package _14_type_info._09_interface_typeInfomation;

/**
 * @Author wx-li
 * @Date 2019/8/31 17:25
 * Sneaking around an interface.
 **/

class B implements A {
    @Override
    public void f() {}
    public void g() {}
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); //Compile error
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
