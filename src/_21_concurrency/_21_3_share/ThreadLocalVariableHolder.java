package _21_concurrency._21_3_share;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author wx-li
 * @Date 2019/8/22 10:31
 **/
class Accessor implements Runnable{
    private final int id;

    public Accessor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + ": " + ThreadLocalVariableHolder.get();
    }
}

//将状态与线程关联起来
public class ThreadLocalVariableHolder {
    //ThreadLocalVariableHolder 里面的 一个 匿名内部类对象
    private static ThreadLocal<Integer> value =
            new ThreadLocal<Integer>() {
                private Random rand = new Random(47);
                protected synchronized Integer initialValue() {
                    return rand.nextInt(10000);
                }
            };
    public static void increment() {
        value.set(value.get() + 1);
    }
    public static Integer get(){return value.get();}

    public static void main(String[] args) throws InterruptedException {
        //这个线程池应该是执行了多少次execute()就创建多少个线程的
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Accessor(i));
        }
        //Run for a while
        TimeUnit.SECONDS.sleep(3);
        //After 3 seconds,All Accessors will quit
        exec.shutdownNow();
        //神奇的是如果中这样写的话 正在执行的线程不会受到影响(所以会继续执行)，只是说不能再提交新的任务而已，终于明白了
        exec.shutdown();
    }
}
