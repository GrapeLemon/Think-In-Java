package _21_concurrency._21_3_share;

/**
 * @Author wx-li
 * @Date 2019/8/22 10:11
 **/
class DualSynch {
    private Object syncObject = new Object();

    //这个用的是当前对象的锁
    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    /**
     *     神奇的是如果给这个方法使用sync关键字，它们是会互相阻塞的，因为使用的是对象锁
     *     一个对象拿到锁，执行上面的方法，除非上面的方法执行解锁然后把锁释放，不然的话这个对象的其他方法都是不能执行的！
     *     所以对 get 和 set 方法同时使用sync关键字的含义是什么，我想我明白了...
     */
    //这个用的是当前对象的一个成员对象的锁
    public /*synchronized*/ void g(){
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}

public class SyncObject{
    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();
        new Thread() {
            @Override
            public void run() {
                //这个方法在另一个线程中执行
                ds.f();
            }
        }.start();
        //这个方法在main()线程中执行
        ds.g();
    }
}
