package _21_concurrency._21_2_basic;

import java.util.concurrent.ThreadFactory;

/**
 * @ClassName DaemonThreadFactory
 * @Description TODO
 * @Author wx-li
 * @Date 2019/8/21 9:23
 **/
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
