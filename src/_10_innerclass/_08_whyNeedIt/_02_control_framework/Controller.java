package _10_innerclass._08_whyNeedIt._02_control_framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/8/28 17:02
 * The reusable framework for control systems.
 **/
public class Controller {
    // A class from java.util. to hold Event objects:
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c){eventList.add(c);}
    public void run() {
        while (eventList.size() > 0) {
            //Make a copy so you're not modifying the list
            //while you're selecting the elements in it:
            //噢 这招知道是什么意思了 如果在循环里面remove的话是会报错的，但是遍历的是复制品，改的是真的那个，就不会有影响了，实在是高
            for (Event e : new ArrayList<Event>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
