package _09_interface._03_totallyjieou;

/**
 * @Author wx-li
 * @Date 2019/8/27 10:48
 **/
public class BandPass extends Filter{
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public WaveForm process(WaveForm input){
        return input;   //Dummy processing
    }

}
