package _10_innerclass._03_usethisAndnew;

/**
 * @Author wx-li
 * @Date 2019/8/28 9:11
 * Qualifying access to the outer-class object.
 **/
public class DotThis{
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Innner {
        public DotThis outer() {
            return DotThis.this;
            //A plain "this" would be Inner's "this"    plain 纯粹的
            //这句话的意思是，纯粹的 this 就真的是 表示内部类的当前对象了
        }
    }

    public Innner inner(){return new Innner();}

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Innner dti = dt.inner();
        dti.outer().f();
    }
}
