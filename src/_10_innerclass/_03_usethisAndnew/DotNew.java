package _10_innerclass._03_usethisAndnew;

/**
 * @Author wx-li
 * @Date 2019/8/28 9:28
 * Creating an inner class directly using the .new syntax.
 **/
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
