package _21_concurrency._21_2_basic;

/**
 * @ClassName Daemons
 * @Description TODO
 * @Author wx-li
 * @Date 2019/8/21 9:49
 **/

class Daemon implements Runnable{
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DeamonSpawn());
            t[i].start();
            System.out.println("DeamonSpawn" + i + "started.");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "].isDeamon() = " + t[i].isDaemon());
        }
    }
}

class DeamonSpawn implements Runnable{

    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}

public class Daemons {
    public static void main(String[] args) {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println();
    }
}
