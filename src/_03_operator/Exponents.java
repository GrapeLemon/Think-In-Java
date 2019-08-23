package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:58
 * "e" means "10 to the power"
 **/
public class Exponents {
    public static void main(String[] args) {
        //Uppercase and lowercase 'e' are the same:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;       //f is use for E-43,because it's a double literal
        System.out.println("expFloat = " + expFloat);
        double expDouble = 47e47d;  // 'd' is optional
        double expDouble2 = 47e47;  // Antomatically double
        System.out.println("expDouble2 = " + expDouble);
    }
}
