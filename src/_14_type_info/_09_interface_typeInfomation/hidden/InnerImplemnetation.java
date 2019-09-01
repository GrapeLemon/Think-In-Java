package _14_type_info._09_interface_typeInfomation.hidden;

import _14_type_info._09_interface_typeInfomation.A;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lwx
 * @date 2019/9/1-9:44
 * Private inner classes can't hide from reflection.
 */

class InnerA {
    private static class C implements A {
        @Override
        public void f() {System.out.println("public C.f()");}
        public void g() {System.out.println("public C.g()");}
        void u() {System.out.println("package C.u()");}
        protected void v() {System.out.println("protected C.v()");}
        private void w() {System.out.println("private C.w()");}
    }
    public static A makeA(){return new C();}
}

public class InnerImplemnetation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the private class:
        HiddenImplementation.callHiddenMethod(a,"g");
        HiddenImplementation.callHiddenMethod(a,"u");
        HiddenImplementation.callHiddenMethod(a,"v");
        HiddenImplementation.callHiddenMethod(a,"w");
    }
}
