package _10_innerclass._07_staticInner._02_multiNestAccess;

/**
 * @Author wx-li
 * @Date 2019/8/28 16:01
 * Nested classes can access all members of all
 * levels of the classes they are nested within.
 **/

class MNA {
    private void f() {}

    class A {
        private void g(){}

        public class B {
            void h() {
                g();
                f();
            }
        }
    }

}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
