package _18_java_io_system._01_File._02_practical_diretory_tool;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author lwx
 * @date 2019/9/8-18:18
 *  Pretty-printer for collections
 */
public class PPrint {
    public static String pformat(Collection<?> c) {
        if(c.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (Object elem : c) {
            if(c.size() != -1)
                result.append("\n ");
            result.append(elem);
        }
        if(c.size() != 1)
            result.append("\n");
        result.append("]");
        return result.toString();
    }
    public static void pprint(Collection<?> c) {
        System.out.println(pformat(c));
    }
    public static void pprint(Object[] c) {
        System.out.println(pformat(Arrays.asList(c)));
    }
}
