package _21_concurrency._21_3_share;

/**
 * @Author wx-li
 * @Date 2019/8/21 14:31
 **/
public class EvenGenerator extends IntGenerator{
    private int currentEvenvalue = 0;

    @Override
    public synchronized int next() {
        //Danger point here!
        ++ currentEvenvalue;
        Thread.yield();
        ++ currentEvenvalue;
        return currentEvenvalue;
    }
//
//    public void unsyncNext(){
//        ++ currentEvenvalue;
//        ++ currentEvenvalue;
//    }


    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
