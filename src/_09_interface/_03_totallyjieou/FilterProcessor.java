package _09_interface._03_totallyjieou;

/**
 * @Author wx-li
 * @Date 2019/8/27 11:10
 **/
public class FilterProcessor {
    public static void main(String[] args) {
        WaveForm w = new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)),w);
    }
}
