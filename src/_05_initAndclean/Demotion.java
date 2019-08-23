package _05_initAndclean;

/**
 * @author lwx
 * @date 2019/8/23-20:40
 */
public class Demotion {
    //f1
    void f1(char c) {
        System.out.print("f1(char) ");
    }

    void f1(byte c) {
        System.out.print("f1(byte) ");
    }

    void f1(short c) {
        System.out.print("f1(short) ");
    }

    void f1(int c) {
        System.out.print("f1(int) ");
    }

    void f1(long c) {
        System.out.print("f1(long) ");
    }

    void f1(float c) {
        System.out.print("f1(float) ");
    }

    void f1(double c) {
        System.out.print("f1(double) ");
    }

    //f2
    void f2(char c) {
        System.out.print("f2(char) ");
    }

    void f2(byte c) {
        System.out.print("f2(byte) ");
    }

    void f2(short c) {
        System.out.print("f2(short) ");
    }

    void f2(int c) {
        System.out.print("f2(int) ");
    }

    void f2(long c) {
        System.out.print("f2(long) ");
    }

    void f2(float c) {
        System.out.print("f2(float) ");
    }
    
    //f3
    void f3(char c) {
        System.out.print("f3(char) ");
    }

    void f3(byte c) {
        System.out.print("f3(byte) ");
    }

    void f3(short c) {
        System.out.print("f3(short) ");
    }

    void f3(int c) {
        System.out.print("f3(int) ");
    }

    void f3(long c) {
        System.out.print("f3(long) ");
    }
    
    //f4
    void f4(char c) {
        System.out.print("f4(char) ");
    }

    void f4(byte c) {
        System.out.print("f4(byte) ");
    }

    void f4(short c) {
        System.out.print("f4(short) ");
    }

    void f4(int c) {
        System.out.print("f4(int) ");
    }
    
    //f5
    void f5(char c) {
        System.out.print("f5(char) ");
    }

    void f5(byte c) {
        System.out.print("f5(byte) ");
    }

    void f5(short c) {
        System.out.print("f5(short) ");
    }

    //f6
    void f6(char c) {
        System.out.print("f6(char) ");
    }

    void f6(byte c) {
        System.out.print("f6(byte) ");
    }

    //f7
    void f7(char c) {
        System.out.print("f7(char) ");
    }

    //IDEA真的强大，可以准确定位到这行代码调用的是重载方法中的哪一个
    void testDouble(){
        double x = 0;
        System.out.print("double argument:");
        f1(x);
        f2((float) x);
        f3((long)x);
        f4((int)x);
        f5((short) x);
        f6((byte) x);
        f7((char) x);
    }

    public static void main(String[] args) {
        Demotion p = new Demotion();
        p.testDouble();
    }
}
