package _16_array._04_multidimensional_array;

import java.util.Arrays;

/**
 * @Author wx-li
 * @Date 2019/9/3 17:12
 **/
public class AutoboxingArrays {
    public static void main(String[] args) {
        Integer[][] a ={
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        };
        System.out.println(Arrays.deepToString(a));
    }
}
