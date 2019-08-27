package _08_poly._05_jicheng._02_RTTI;

import _19_String.UsingStringBuilder;

/**
 * @Author wx-li
 * @Date 2019/8/27 9:44
 * Downcasting & Runtime type information(RTTI)
 * (ThrowsException)
 **/

class Useful {
    public void f() { }
    public void g() { }
}

class MoreUseful extends Useful {
    public void f(){}
    public void g(){}
    public void u(){}
    public void v(){}
    public void w(){}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
//        Compile time : method not found in Useful
//        x[1].u();
        ((MoreUseful)x[1]).u();     //Downcast/RTTI
        ((MoreUseful)x[0]).u();     //Exception thrown
    }
}
