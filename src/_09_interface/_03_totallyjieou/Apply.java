package _09_interface._03_totallyjieou;

import java.util.Arrays;

/**
 * @Author wx-li
 * @Date 2019/8/27 10:28
 **/

//class StringProcessor {
//    public String name() {
//        return getClass().getSimpleName();
//    }
//    Object process(Object input) {
//        return input;
//    }
//}

class Upcase extends StringProcessor {
    public String process(Object iuput) {
        return ((String) iuput).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    public String process(Object iuput) {
        return ((String) iuput).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        //The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor  " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
