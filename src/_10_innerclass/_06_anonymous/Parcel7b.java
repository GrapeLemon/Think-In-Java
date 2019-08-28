package _10_innerclass._06_anonymous;

import _10_innerclass._04_innerAndUpcast.Contents;

/**
 * @Author wx-li
 * @Date 2019/8/28 11:23
 * Expanded version of Parcel7.java
 **/
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    public Contents contents(){return new MyContents();}

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents s = p.contents();
    }
}
