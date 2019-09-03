package _20_annotation._02_annotation_handler._02_restriction_of_default_value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  注意，对于非基本类型的元素，无论是在源代码中声明，或是在注解中定义默认值时，都不能以null作为其值。
 *  这个约束使得处理器很难表现一个元素的存在或缺失的状态，因为在每个注解的声明中，所有的元素都存在，
 *  并且都具有相应的值。为了绕开这个约束，我们只能自己定义一些特殊的值，例如空字符串或负数。以此
 *  表示某个元素不存在。
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
    int id() default -1;
    String description() default "";
    //在定义注解的时候，这算得上是一个习惯语法
}
