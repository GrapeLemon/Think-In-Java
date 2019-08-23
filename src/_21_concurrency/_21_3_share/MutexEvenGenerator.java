package _21_concurrency._21_3_share;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author wx-li
 * @Date 2019/8/21 15:49
 **/
public class MutexEvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    //Reentrant 可重入的，使用这把锁应该跟那个 sync关键字效果是一样的，因为这个对象锁也是可重入的
    private Lock lock = new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            //事实证明是可以的
//            System.out.println("return以后 finally块还能执行？");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}
