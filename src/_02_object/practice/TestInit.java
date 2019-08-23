package _02_object.practice;

/**
 * @Author wx-li
 * @Date 2019/8/23 10:11
 **/
public class TestInit {
    int i;
    char c;

    public static void main(String[] args) {
        TestInit obj = new TestInit();
        System.out.println("obj.i = " + obj.i);
        System.out.println("obj.c = " + obj.c);
        System.out.println("obj.(int)c= " + (int)obj.c);
    }
}
