package _20_annotation._02_annotation_handler._01_annotation_elements;

import _15_generics._10_wildcard.Apple;
import _20_annotation._01_basic_grammar._01_define.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author wx-li
 * @Date 2019/9/3 19:25
 * 如果你使用了其他类型,那编译器就会报错.注意,也不允许使用任何包装类型.(毕竟那些自定义类型都用不了),
 * 不过由于自动打包的存在,这算不上什么限制.
 * 注解也可以作为元素的类型,也就是说注解可以嵌套,稍后你会看到,这是一个很有用的技巧.
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Elements {
    //primitive type
    boolean is();
    boolean[] ais();
    byte b();
    byte[] ab();
    char c();
    char[] ac();
    short s();
    short[] as();
    int i();
    int[] ai();
   long l();
   long[] al();
   float f();
   float[] af();
   double d();
   double[] ad();
   //String
   String str();
   String[] astt();
   //Class
   Class<?> clazz();
   Class<?>[] aclazz();
    //ENUM
    COLOR color();
    COLOR acolor();
    //Annotation
    Test test() default @Test;
    Test[] atest()default {@Test,@Test,};
}
