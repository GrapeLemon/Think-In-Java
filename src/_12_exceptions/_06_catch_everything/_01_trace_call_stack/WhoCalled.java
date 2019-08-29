package _12_exceptions._06_catch_everything._01_trace_call_stack;

/**
 * @Author wx-li
 * @Date 2019/8/29 17:54
 * Programmatic access to stack trace information.
 **/
public class WhoCalled {
    static void f() {
        //Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste);
            }
        }
    }
    static void g(){f();}
    static void h(){g();}

    public static void main(String[] args) {
        f();
        System.out.println("---------------------------------------");
        g();
        System.out.println("---------------------------------------");
        h();
    }
}
