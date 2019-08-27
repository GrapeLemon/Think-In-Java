package _09_interface._06_adapter;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @Author wx-li
 * @Date 2019/8/27 16:10
 * Creating an adapter with inheritance
 **/
public class AdaptedRandomDoubles extends RandomDoubles implements Readable{
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }
}
