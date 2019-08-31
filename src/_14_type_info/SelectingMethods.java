package _14_type_info;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/31 16:19
 * Looking for particular methods in a dynamic proxy.
 **/
class MethodSelector implements InvocationHandler {
    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting")) {
            System.out.println("Proxy detected the interesting method");
            return method.invoke(proxied, args);
        }else
            return null;
    }
}

interface SomeMethods {
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}

class Implementation implements SomeMethods {

    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }
}

class SelectingMethods{
    public static void main(String[] args) {
        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(
            SomeMethods.class.getClassLoader(),
            new Class[]{SomeMethods.class},
            new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }
}

