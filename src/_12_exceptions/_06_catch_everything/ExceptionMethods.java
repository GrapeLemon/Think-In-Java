package _12_exceptions._06_catch_everything;

/**
 * @Author wx-li
 * @Date 2019/8/29 17:48
 * Demonstrating the Exception Methods.
 **/
public class ExceptionMethods{
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
