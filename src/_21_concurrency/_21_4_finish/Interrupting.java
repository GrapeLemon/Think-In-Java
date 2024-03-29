package _21_concurrency._21_4_finish;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Author wx-li
 * @Date 2019/8/22 13:48
 **/
class SleepBlocked implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}

class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        //原来这个 throw有两种含义，它不仅会创建一个异常对象,而且不会在执行下面的代码，相当于返回了一个特殊的信号给调用者
//        throw new RuntimeException();
        try {
            System.out.println("Waiting for read(): ");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted from blocked I/O");
            } else {
                throw new RuntimeException(e);
            }
        }
    }
}

class SyncronizedBlocked implements Runnable {

    public synchronized void f() {
        //Never releases lock
        while (true) {
            Thread.yield();
        }
    }

    public SyncronizedBlocked() {
        new Thread(){
            @Override
            public void run() {
                //Lock acquired by this thread
                f();
            }
        }.start();
    }

    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SyncronizedBlocked.run()");
    }
}

public class Interrupting{
    private static ExecutorService exec = Executors.newCachedThreadPool();

   static void test(Runnable r) throws InterruptedException {
       Future<?> f = exec.submit(r);
       TimeUnit.MILLISECONDS.sleep(100);
       System.out.println("Interrupting " + r.getClass().getSimpleName());
       //Interrupts if running
       f.cancel(true);
       System.out.println("Interrupt send to " + r.getClass().getSimpleName());
   }

    public static void main(String[] args) throws InterruptedException {
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SyncronizedBlocked());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Aborting with System.exit(0)");
        System.exit(0);
    }
}


