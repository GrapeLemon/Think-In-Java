package _12_exceptions._04_define_byYourself;

/**
 * @Author wx-li
 * @Date 2019/8/29 16:37
 * Creating your own exceptions.
 **/

class SimpleException extends Exception {}

public class InheritingExceptions{
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }
    }
}
