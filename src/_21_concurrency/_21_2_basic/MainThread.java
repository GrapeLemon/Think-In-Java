package _21_concurrency._21_2_basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    public static void main(String[] args) {
        ExecutorService exec0 = Executors.newCachedThreadPool();
        ExecutorService exec1 = Executors.newFixedThreadPool(5);
        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec1.execute(new LiftOff());
        }
        //这个方法可以保证不会有新的任务被提交到该执行器（线程池）中
        exec1.shutdown();
        System.out.println("下面的任务将不会被执行");
        //在关闭后再提交任务会抛出异常
        exec1.execute(new LiftOff());
    }
}
