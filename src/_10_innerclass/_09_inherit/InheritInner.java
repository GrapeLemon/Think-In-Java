package _10_innerclass._09_inherit;

/**
 * @Author wx-li
 * @Date 2019/8/28 19:38
 * Inheriting an inner class.
 **/
class WithInner {
    class Inner{}
}

public class InheritInner extends WithInner.Inner{
    //!    public InheritInner() {} //Won't compile
    InheritInner(WithInner wi) {
        wi.super(); //这个语法非常特殊，要记住
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        /**
         *  通过观察ii所持有的引用，我是这样理解的：
         *  因为 InheritInner 继承了 WithInner 的内部类，所以相当于 InheritInner也是 WithInner的内部类了
         *  所以要构造这个 InheritInner 的对象，很自然就需要持有外部类的引用，这个逻辑实在是太秀
         */
    }
}
