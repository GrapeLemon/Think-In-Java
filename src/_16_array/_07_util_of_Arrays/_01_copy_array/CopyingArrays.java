package _16_array._07_util_of_Arrays._01_copy_array;

import java.util.Arrays;

/**
 * @Author wx-li
 * @Date 2019/9/3 17:39
 **/
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        System.arraycopy(i,0,j,0,i.length);
        System.out.println("j = " + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i,0,k,0,k.length);
        System.out.println("k = " + Arrays.toString(k));
        Arrays.fill(k,103);
        System.arraycopy(k,0,i,0,k.length);
        System.out.println("i = " + Arrays.toString(i));
        // Objects:
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, 47);
        Arrays.fill(v, 99);
        System.out.println("u = " + Arrays.toString(u));
        System.out.println("v = " + Arrays.toString(v));
        // 如果复制对象数组,那么只是复制了对象的引用——而不是对象本身的拷贝.这被称为浅复制(shallow copy)
        System.arraycopy(v,0,u,u.length/2,v.length);
        System.out.println("u = " + Arrays.toString(u));
        // How to provide it's sgallow copy?
        Arrays.fill(v,2);
        System.out.println("v = " + Arrays.toString(v));
        System.out.println("u = " + Arrays.toString(u));
        //通过观察结果包装类型实行的方案是深复制(deep copy)
    }
}
