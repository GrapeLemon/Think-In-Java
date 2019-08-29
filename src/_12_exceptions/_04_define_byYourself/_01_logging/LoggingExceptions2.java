package _12_exceptions._04_define_byYourself._01_logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author wx-li
 * @Date 2019/8/29 16:56
 * Logging caught exceptions.
 **/
public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
