package _12_exceptions._07_standard._01_runtimeException;

/**
 * @Author wx-li
 * @Date 2019/8/30 9:26
 **/
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }
    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
