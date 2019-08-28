package _10_innerclass._05_localInner;

/**
 * @Author wx-li
 * @Date 2019/8/28 11:07
 * Nesting a class within a scope.
 **/
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip(){return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        //Can't use it here! Out of Scope:
        //TrackingSlip ts = new TrackingSlip("x");
    }
    public void track(){internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 P = new Parcel6();
        P.track();
    }
}
