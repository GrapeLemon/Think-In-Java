package _08_poly;

/**
 * @Author wx-li
 * @Date 2019/8/26 17:08
 * Direct field access is determined at compile time.
 **/
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();  //Upcast
        System.out.println("sup.filed = " + sup.field +"， sup.getFiled() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.filed = " + sub.field +"， sub.getFiled() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());

    }
}
