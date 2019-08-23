package _21_concurrency._21_3_share;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author wx-li
 * @Date 2019/8/21 16:08
 **/
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untimed(){
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock()： " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }
    public void timed() throws InterruptedException {
        boolean captured = false;
        captured = lock.tryLock(2, TimeUnit.SECONDS);
        try {
            System.out.println("tryLock()： " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final AttemptLocking al = new AttemptLocking();
        //True -- lock is available
        al.untimed();
        //Ture -- lock is available
        al.timed();
        new Thread(){
            {setDaemon(true); }

            public void run(){
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
