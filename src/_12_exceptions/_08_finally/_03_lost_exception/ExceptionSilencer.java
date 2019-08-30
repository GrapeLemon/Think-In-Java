package _12_exceptions._08_finally._03_lost_exception;

/**
 * @Author wx-li
 * @Date 2019/8/30 10:41
 **/
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
          //Using 'return' inside the finally block
            //will silence any thrown exception.
            return;
        }
    }
}
