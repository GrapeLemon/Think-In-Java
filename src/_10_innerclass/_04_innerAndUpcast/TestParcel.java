package _10_innerclass._04_innerAndUpcast;

/**
 * @Author wx-li
 * @Date 2019/8/28 9:50
 **/

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }
    public PDestination destination(String s) {
        return new PDestination(s);
    }
    public PContents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
//        Illegal -- can't access private class:
//        Parcel4.PContents pc = p.new PContents();
    }
}
