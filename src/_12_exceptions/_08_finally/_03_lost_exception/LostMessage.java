package _12_exceptions._08_finally._03_lost_exception;

/**
 * @Author wx-li
 * @Date 2019/8/30 10:34
 * How an exception can be lost.
 **/

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {
}
