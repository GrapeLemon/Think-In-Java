package _20_annotation._02_annotation_handler._03_generate_outside_file;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author wx-li
 * @Date 2019/9/3 19:51
 **/
//可以写多个,点进去看发现是用的枚举数组,但是只有一个元素的时候可以不用花括号
//如果不写这个@Target的话就是用在什么地方都行,但是这个用法并不常见
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
