package _10_innerclass._08_whyNeedIt._02_control_framework;

/**
 * @Author wx-li
 * @Date 2019/8/28 16:58
 **/
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() {   //Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() > eventTime;
    }
    public abstract void action();
}
