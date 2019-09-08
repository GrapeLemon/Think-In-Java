package _19_enum._03_use_enum_in_switch;
import static _19_enum._03_use_enum_in_switch.Signal.*;
/**
 * @author lwx
 * @date 2019/9/8-21:43
 */

public class TrafficLight {
    Signal color = Signal.RED;
    public void change() {
        switch (color) {
            // Note that you don't have to say Signal.RED
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
