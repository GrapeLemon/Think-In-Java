package _21_concurrency._21_2_basic;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName DeamonThreadPoolExecutor
 * @Description TODO
 * @Author wx-li
 * @Date 2019/8/21 9:33
 **/
public class DeamonThreadPoolExecutor extends ThreadPoolExecutor{
    public DeamonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<>(), new DaemonThreadFactory());
    }
}
