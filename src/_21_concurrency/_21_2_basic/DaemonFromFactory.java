package _21_concurrency._21_2_basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName DaemonFromFactory
 * @Description TODO
 * @Author wx-li
 * @Date 2019/8/21 9:25
 **/
public class DaemonFromFactory implements Runnable{
    @Override
    public void run() {
        while (true) {
            //学过之后就知道了，这里的异常只能被处理不能被抛出，因为抛出的异常是返回不到调用者那里的
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(
                new DaemonThreadFactory());
        for (int i = 0; i < 10; i++)
            exec.execute(new DaemonFromFactory());
            System.out.println("All daemons started");
            //Run for a while
            TimeUnit.MILLISECONDS.sleep(500);
    }
}
