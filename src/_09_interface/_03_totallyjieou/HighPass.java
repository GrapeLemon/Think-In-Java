package _09_interface._03_totallyjieou;

/**
 * @Author wx-li
 * @Date 2019/8/27 10:47
 **/
public class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public WaveForm process(WaveForm input){
        return input;   //Dummy processing
    }
}
