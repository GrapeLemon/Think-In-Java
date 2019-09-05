package _17_go_deep_in_container._09_hash_and_hashcode;

import java.util.Random;

/**
 * @author wx-li
 * @date 2019/9/5-17:50
 * Predicting the weather with groundhogs.
 **/
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;
    public String toString() {
        if(shadow)
            return "Six more weeks of Winter";
        else
            return "Early Spring!";
    }
}
