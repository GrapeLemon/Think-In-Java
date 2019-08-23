package _02_object.practice;

/**
 * @Author wx-li
 * @Date 2019/8/23 10:19
 **/
public class TestStatic {
    public static String staticStr = "i am only one for Class！";
    public String str = "each object has me!";

    public static void main(String[] args) {
        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
        System.out.println();
    }
}
