package _12_exceptions._08_finally._01_to_do_what;

import java.util.TreeSet;

/**
 * @Author wx-li
 * @Date 2019/8/30 9:57
 **/
public class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state = false;
        System.out.println(this);
    }
    public String toString() {
        return state ? "on" : "off";
    }
}
