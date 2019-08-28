package _10_innerclass._06_anonymous;

import _10_innerclass._04_innerAndUpcast.Contents;

/**
 * @Author wx-li
 * @Date 2019/8/28 11:17
 * Returning an instance of an anonymous inner class.
 **/
public class Parcel7 {
    public Contents contents() {
        return new Contents() { //Insert a class definition
            private int i = 11;
            public int value() {
                return i;
            }
        };  //Semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents s = p.contents();
    }
}
