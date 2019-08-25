package _05_initAndclean._4_this;

/**
 * @author lwx
 * @date 2019/8/23-21:32
 * Simple use of the "this" keyword
 */
public class Leaf {
    int i = 0;

    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
