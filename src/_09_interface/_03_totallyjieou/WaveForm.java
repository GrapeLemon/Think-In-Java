package _09_interface._03_totallyjieou;

/**
 * @Author wx-li
 * @Date 2019/8/27 10:40
 **/
public class WaveForm {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "WaveForm{" +
                "id=" + id +
                '}';
    }
}
