package _11_container._08_stack;

/**
 * @Author wx-li
 * @Date 2019/8/29 10:48
 **/
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
