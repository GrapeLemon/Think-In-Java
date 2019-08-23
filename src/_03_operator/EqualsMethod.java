package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:21
 **/
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        //equals()默认比较的是引用,但是这里为什么会能正确比较这个值呢？答案就是 Integer重写了equals()!查一下就知道了
        System.out.println("n1.equals(n2) : " + n1.equals(n2));     //true
    }
}
