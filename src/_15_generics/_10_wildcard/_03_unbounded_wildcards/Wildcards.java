package _15_generics._10_wildcard._03_unbounded_wildcards;

import _15_generics._10_wildcard._01_how_smart_the_compiler_is.Holder;

/**
 * @Author wx-li
 * @Date 2019/9/3 14:57
 * Exploring the meaning of wildcards.
 **/
public class Wildcards {
    // Raw argument:
    static void rawArgs(Holder holder, Object arg) {
        holder.set(arg);
    }
}
