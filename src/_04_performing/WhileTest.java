package _04_performing;

/**
 * @Author wx-li
 * @Date 2019/8/23 16:18
 **/
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while(condition()){
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }
}
