package _14_type_info._02_class_object._01_class_constant;

import java.util.Random;

/**
 * @Author wx-li
 * @Date 2019/8/30 17:46
 **/

class Initable {
    static final int staticFinal = 47;
    //"hello world!" 和 47 一样,它们都是"编译器常量"
    static final String staticFinalStr = "hello world!";
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        //Does not trigger initialization:
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinalStr);
        //Does trigger initialization:
        System.out.println(Initable.staticFinal2);
        //Does trigger initialization:
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("_14_type_info._02_class_object._01_class_constant.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
