package _14_type_info._08_null_object;

import javax.lang.model.type.NullType;

/**
 * @Author wx-li
 * @Date 2019/8/31 16:47
 **/

interface Null {
    
}

public class Person {
    public final String first;
    public final String last;
    public final String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }
    public static class NullPerson
    extends Person implements Null{
        public NullPerson() {
            super("None", "None", "None");
        }
        public String toString(){return "NullPerson";}
    }

    public static final Person NULL = new NullPerson();
}
