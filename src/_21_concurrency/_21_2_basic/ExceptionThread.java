package _21_concurrency._21_2_basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author wx-li
 * @Date 2019/8/21 13:42
 **/
public class ExceptionThread implements Runnable{
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
