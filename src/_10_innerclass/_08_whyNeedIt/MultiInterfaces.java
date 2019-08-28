package _10_innerclass._08_whyNeedIt;

/**
 * @Author wx-li
 * @Date 2019/8/28 16:10
 * Two ways that a class can implement multiple interfaces.
 **/

interface A{}
interface B{}

class X implements A, B {}

class Y implements A {
    B makeB() {
        //Anonymous inner class:
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takesA(A a){}
    static void takesB(B b){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}
