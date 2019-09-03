package _20_annotation._01_basic_grammar._01_define;

import _20_annotation._01_basic_grammar._01_define.Test;

/**
 * @Author wx-li
 * @Date 2019/9/3 18:52
 **/
public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }
    @Test
    void testExecute() { execute(); }
}
