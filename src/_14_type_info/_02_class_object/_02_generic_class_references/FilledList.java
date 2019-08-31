package _14_type_info._02_class_object._02_generic_class_references;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/8/31 11:09
 **/

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    public String toString(){ return Long.toString(id);}
    public CountedInteger(String s){}
    public CountedInteger(){}
}

/**
 *  注意,这个类必须假设与它一同工作的任何类型都具有一个默认的构造器(无参构造器),
 *  并且如果不符合该条件,你将得到一个异常.
 */
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type) {
        this.type = type;
    }
    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < nElements; i++) {
            try {
                result.add(type.newInstance());
            } catch (Exception e) {
                //这样写可以让我们调用该方法时不需要处理该异常(因为是运行时异常),但是又能看到具体的异常信息
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }

}
