package _05_initAndclean._4_this;

/**
 * @author lwx
 * @date 2019/8/23-21:27
 */
public class Apricot {
    void pick() {
        System.out.println("pick()");
    }
    void pit(){
        pick();
    }

    public static void main(String[] args) {
        Apricot a = new Apricot();
        a.pit();
    }
}
