package _14_type_info._09_interface_typeInfomation.hidden;

import _14_type_info._09_interface_typeInfomation.A;
import _14_type_info._09_interface_typeInfomation.hidden.HiddenC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lwx
 * @date 2019/9/1-9:27
 */
public class HiddenImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Compile error: cannot find symbol 'C'
        /* if(a instanceof C) {
            C c = (C) a;
            c.g();
        } */

        // Oops! Reflection still allows us to call g():
        callHiddenMethod(a, "g");
        //And even methods that are less accessible!
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void callHiddenMethod(Object a, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
