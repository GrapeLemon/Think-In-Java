package _12_exceptions._10_exceptions_in_constructors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author wx-li
 * @Date 2019/8/30 13:20
 * Paying attention to exceptions in constructors
 **/
public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            // Wasn't open, so don't close it
            throw e;
        } catch (Exception e) {
            // All other exceptions must close it
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;    // Rethrow
        } finally {
            // Don't close it here!!!
            // 在本例中,由于finally会在每次完成构造器之后都执行一遍,因此它是在不该是调用close()关闭文件的地方吗.
            // 我们希望文件在InputFile对象的整个声明周期内都处于打开状态.
        }
    }
    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
