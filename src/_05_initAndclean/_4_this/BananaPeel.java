package _05_initAndclean._4_this;

/**
 * @author lwx
 * @date 2019/8/23-21:24
 */

class Banana {
    void peel(int i){
        System.out.println(i);
    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
