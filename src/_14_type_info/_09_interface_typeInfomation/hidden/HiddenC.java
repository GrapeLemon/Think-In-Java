package _14_type_info._09_interface_typeInfomation.hidden;

import _14_type_info._09_interface_typeInfomation.A;

/**
 * @Author wx-li
 * @Date 2019/8/31 17:29
 **/

class C implements A {
    public void f() {
        System.out.println("public C.f()");
    }
    public void g() {
        System.out.println("public C.g()");
    }
    void u() {
        System.out.println("package C.u()");
    }
    protected void v() {
        System.out.println("protected C.v()");
    }
    private

}

public class HiddenC {
}
