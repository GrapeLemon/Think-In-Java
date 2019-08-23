package _03_operator;

/**
 * @Author wx-li
 * @Date 2019/8/23 13:37
 **/
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;       //Hexadecimal (lowercase)
        System.out.println("i1 = " + Integer.toBinaryString(i1));   //10,1111
        int i2 = 0X2F;      //Hexadecimal (uppercase)
        System.out.println("i2 = " + Integer.toBinaryString(i2));   //10,1111
        int i3 = 0177;      //Octal (leanding zero)
        System.out.println("i3 = " + Integer.toBinaryString(i3));   //1,111,111
        char c = 0xffff;    //max char hex value
        System.out.println("c = " + Integer.toBinaryString(c));     //1111,1111,1111,1111
        byte b = 0x7f;      //max byte hex value
        System.out.println("b = " + Integer.toBinaryString(b));     //111,1111
        short s = 0x7fff;   //max short hex value
        System.out.println("s = " + Integer.toBinaryString(s));     //111,1111,1111,1111
        long n1 = 200L;     //long suffix
        long n2 = 200l;     //long suffix(but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;      //float suffix
        float f3 = 1f;      //float suffix
        double d1 = 1d;     //double suffix
        double d2 = 1D;     //double suffix
        //Hex and Octal also work with long
    }
}
