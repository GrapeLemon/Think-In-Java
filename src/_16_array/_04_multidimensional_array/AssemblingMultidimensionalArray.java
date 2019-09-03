package _16_array._04_multidimensional_array;

import java.util.Arrays;

/**
 * @Author wx-li
 * @Date 2019/9/3 17:18
 **/
public class AssemblingMultidimensionalArray {
    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i*j; // Autoboxing
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
