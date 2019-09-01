package _14_type_info._09_interface_typeInfomation.hidden;

import _14_type_info._09_interface_typeInfomation.A;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lwx
 * @date 2019/9/1-9:51
 */

class AnonymousA {
    public static A makeA() {
        return new A() {
            @Override
            public void f() {System.out.println("public C.f()");}
            public void g() {System.out.println("public C.g()");}
            void u() {System.out.println("package C.u()");}
            protected void v() {System.out.println("protected C.v()");}
            private void w() {System.out.println("private C.w()");}
        };
    }
}

public class AnonymousImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the anonymous class:
        HiddenImplementation.callHiddenMethod(a,"g");
        HiddenImplementation.callHiddenMethod(a,"u");
        HiddenImplementation.callHiddenMethod(a,"v");
        HiddenImplementation.callHiddenMethod(a,"w");
    }
}
