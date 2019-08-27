package _09_interface._08_nested_interface;

/**
 * @Author wx-li
 * @Date 2019/8/27 16:29
 **/

class A {
    interface B { void f();}
    public class BImp implements B { public void f() {}}
    private class BImp2 implements B { public void f() {}}
    public interface C { void f();}
    class CImp implements C { public void f() {}}
    private class CImp2 implements C {public void f() {}}
    private interface D {void f();}
    private class DImp implements D {public void f() {}}
    public class DImp2 implements D { public void f() {}}
    public D getD(){return new DImp2();}
    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G { void f();}
    //Redundant "public":
    public interface H { void f();}
    void g();
    //Cannot be private within an interface
    //意思就是在接口里面不能出现private修饰的东西
//    private interface I{}
}
public class NestingInterfaces {
    public class BImp implements A.B {public void f() {}}
    class Cimp implements A.C { public void f() {}}

    //Cannot implement a private interface except
    //within that interface's defining class:
//    class DImp implements A.D {
//        public void f() {
//        }
//    }
    //内部类实现外部接口
    class EImp implements E { public void g() {}}
    //内部类实现外部接口的内部接口
    class EGImp implements E.G {public void f() { }}

    class EImp2 implements E { public void g() {}
        //内部类里面的内部类实现外部接口的内部接口
        class EG implements E.G { public void f() {}}
    }

    public static void main(String[] args) {
        A a = new A();
        //Can't access A.D:
//        A.D ad = a.getD();
        //Doesn't return anything but A.D:
//        A.DImp2 di2 = a.getD();
        //Cannot access a member of the interface:
        //说白了就是这个D的实现类只能在定义它的类的内部使用,不允许在外部使用
//        a.getD().f();
        //Only another A can do anything with getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
