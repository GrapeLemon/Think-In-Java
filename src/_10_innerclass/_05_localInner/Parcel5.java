package _10_innerclass._05_localInner;

import _10_innerclass._04_innerAndUpcast.Destination;

/**
 * @Author wx-li
 * @Date 2019/8/28 10:26
 * Nesting a class within a method
 **/
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
