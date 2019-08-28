package _10_innerclass._07_staticInner._01_inInterface;

/**
 * @Author wx-li
 * @Date 2019/8/28 15:54
 **/
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {

        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
