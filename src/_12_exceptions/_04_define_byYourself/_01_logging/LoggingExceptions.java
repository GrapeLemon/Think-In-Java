package _12_exceptions._04_define_byYourself._01_logging;

import sun.rmi.runtime.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Author wx-li
 * @Date 2019/8/29 16:50
 * An exception that reports through a Logger.
 **/
class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}


