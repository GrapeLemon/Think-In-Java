package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 14:52
 **/
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);       //Converts x to a String
        s += "(summed) = ";                 //Concatenation operator
        System.out.println(s + (x + y + z));
        System.out.println("" + x);         //Shorthand for Integer.toString()
    }
}
