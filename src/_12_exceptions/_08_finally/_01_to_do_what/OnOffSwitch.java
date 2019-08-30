package _12_exceptions._08_finally._01_to_do_what;

/**
 * @Author wx-li
 * @Date 2019/8/30 10:02
 **/
public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1,OnOffException2{}

    public static void main(String[] args) {
        try {
            sw.on();
            //Code that can throw exceptions...
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
