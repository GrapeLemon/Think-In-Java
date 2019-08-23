package _21_concurrency._21_2_basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author wx-li
 * @Date 2019/8/21 13:39
 **/
public class SettingDefaultHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(
                new MyUncaughtExceptionHandler());
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
