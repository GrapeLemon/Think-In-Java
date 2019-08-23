package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:22
 * Default equals() does not compare contents
 **/

class Value {
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        //注意,equals()的默认行为是比较引用,也就是说如果你不重写该方法,效果等价于 "=="
        System.out.println("v1.equals(v2) : " + v1.equals(v2));     //false!!! why?
    }
}
