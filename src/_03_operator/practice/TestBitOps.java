package _03_operator.practice;

/**
 * @Author wx-li
 * @Date 2019/8/23 14:11
 **/
public class TestBitOps {
    public static void main(String[] args) {
        int i1 = 0xAAAAAAAA;      //1010,1010
        System.out.println("i1 = " + Integer.toBinaryString(i1));
        int i2 = 0x55555555;      //0101,0101
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        int i3 = i1 & i2;   //0000,0000
        System.out.println("i3 = " + Integer.toBinaryString(i3));
        int i4 = i1 | i2;   //1111,1111
        System.out.println("i4 = " + Integer.toBinaryString(i4));
        int i5 = i1 ^ i2;   //1111,1111
        System.out.println("i5 = " + Integer.toBinaryString(i5));
        int i6 = ~i1;       //0101,0101
        System.out.println("i6 = " + Integer.toBinaryString(i6));
        int i7 = ~i2;       //1010,1010
        System.out.println("i7 = " + Integer.toBinaryString(i7));
        i1 &= i2;           //0000,0000
        System.out.println("i1 &= i2 : " + Integer.toBinaryString(i1));
        i1 |= i2;           //1111,1111
        System.out.println("i1 |= i2 : " + Integer.toBinaryString(i1));
        i1 ^= i2;           //1111,1111
        System.out.println("i1 ^= i2 : " + Integer.toBinaryString(i1));
        // i1 ~= i2 is not allowed,becasue "~" is single operator
    }
}
