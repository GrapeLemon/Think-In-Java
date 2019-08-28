package _10_innerclass._07_staticInner._01_inInterface;

/**
 * @Author wx-li
 * @Date 2019/8/28 15:56
 * Putting test code in a nested class.
 **/
public class TestBed {
    public void f(){
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
