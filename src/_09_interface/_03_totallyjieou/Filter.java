package _09_interface._03_totallyjieou;

/**
 * @Author wx-li
 * @Date 2019/8/27 10:41
 **/
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input){ return input; }
}
