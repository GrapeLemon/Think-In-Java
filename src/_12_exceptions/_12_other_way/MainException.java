package _12_exceptions._12_other_way;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author wx-li
 * @Date 2019/8/30 14:33
 **/
public class MainException {
    //Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        //Open the file:
        FileInputStream file =
                new FileInputStream("MainException.java");
        //Use the file ...
        //Close the file:
        file.close();
    }
}
