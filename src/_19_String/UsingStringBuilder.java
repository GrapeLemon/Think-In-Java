package _19_String;

import java.util.Random;

public class UsingStringBuilder {
    public static Random rand = new Random(47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        //最后一个字符串后面不需要带分隔符,特殊处理一下
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
        String a = "lwx";
        String c = "22";
        StringBuilder builder = new StringBuilder();
        builder.append(a + ":" + c);
    }
}
