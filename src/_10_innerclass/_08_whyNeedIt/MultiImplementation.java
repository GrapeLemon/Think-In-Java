package _10_innerclass._08_whyNeedIt;

/**
 * @Author wx-li
 * @Date 2019/8/28 16:16
 * With concrete or abstract classes,innner
 * classes are the only way to produce the effect
 * of "multiple implementation inheritance."
 **/

class D{}
abstract class E{}

class Z extends D {
    E makeE(){return new E(){};}
}

public class MultiImplementation {
    static void takesD(D d){}
    static void takesE(E e){}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
