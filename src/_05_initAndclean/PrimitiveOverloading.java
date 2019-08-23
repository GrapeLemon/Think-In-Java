package _05_initAndclean;

/**
 * @author lwx
 * @date 2019/8/23-20:10
 * Promotion of primitives and overloading
 */
public class PrimitiveOverloading {
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

    void f2(double c) {
        System.out.print("f2(double) ");
    }
    
    //f3
    void f3(short c) {
        System.out.print("f3(short) ");
    }

    void f3(int c) {
        System.out.print("f3(int) ");
    }

    void f3(long c) {
        System.out.print("f3(long) ");
    }

    void f3(float c) {
        System.out.print("f3(float) ");
    }

    void f3(double c) {
        System.out.print("f3(double) ");
    }
    
    //f4
    void f4(int c) {
        System.out.print("f4(int) ");
    }

    void f4(long c) {
        System.out.print("f4(long) ");
    }

    void f4(float c) {
        System.out.print("f4(float) ");
    }

    void f4(double c) {
        System.out.print("f4(double) ");
    }
    
    //f5
    void f5(long c) {
        System.out.print("f5(long) ");
    }

    void f5(float c) {
        System.out.print("f5(float) ");
    }

    void f5(double c) {
        System.out.print("f5(double) ");
    }
    
    //f6
    void f6(float c) {
        System.out.print("f6(float) ");
    }

    void f6(double c) {
        System.out.print("f6(double) ");
    }
    
    //f7
    void f7(double x) {
        System.out.print("f7(double)");
    }
    
    void testConstVal(){
        System.out.print("5: ");
        f1(5);
        f2(5);
        f3(5);
        f4(5);
        f5(5);
        f6(5);
        f7(5);
        System.out.println();
    }
    
    void testChar(){
        char x = 'x';
        System.out.print("char: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testByte(){
        byte x = 0;
        System.out.print("byte: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testShort(){
        short x = 0;
        System.out.print("short: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testInt(){
        int x = 0;
        System.out.print("int: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testLong(){
        long x = 0;
        System.out.print("long: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testFloat(){
        float x = 0;
        System.out.print("int: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testDouble(){
        double x = 0;
        System.out.print("double: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    public static void main(String[] args) {
        PrimitiveOverloading p =
            new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testFloat();
        p.testDouble();
    }
    
}