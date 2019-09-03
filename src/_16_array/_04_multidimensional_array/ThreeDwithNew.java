package _16_array._04_multidimensional_array;

import java.util.Arrays;

/**
 * @Author wx-li
 * @Date 2019/9/3 16:58
 **/
public class ThreeDwithNew {
    public static void main(String[] args) {
        // 3-D array with fixed length:
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
}
