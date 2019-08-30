package _12_exceptions._08_finally;

/**
 * @Author wx-li
 * @Date 2019/8/30 9:35
 * The finally clause is always executed.
 *
 * 这个程序也给了我们一些思路，当Java中的异常不允许我们回到异常抛出的地点时，那么该如何应对呢？如果把try块放在循环里，就
 * 建立了一个“程序继续执行之前必须要达到”的条件。还可以加入一个static类型的计数器或者别的装置，使循环在放弃以前能尝试一定的次数（也就是循环多少次）
 * 这将使程序的健壮性更上一个台阶。
 **/

class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                //Post-increment is zero first time:
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2) {
                    break;  //out of "while"
                }
            }
        }
    }
}
