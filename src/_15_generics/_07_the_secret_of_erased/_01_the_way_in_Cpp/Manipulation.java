package _15_generics._07_the_secret_of_erased._01_the_way_in_Cpp;

/**
 * @Author wx-li
 * @Date 2019/9/2 17:06
 **/
class Manipulator<T> {
    private T obj;
    public Manipulator(T x) {obj = x;}
    // Error: cannot find symbol: method f()
    // public void manipulate(){obj.f();}
}
// 这个有点厉害啊,通过继承不就有了吗,虽然麻烦是麻烦了点
class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x) {obj = x;}
    // Error: cannot find symbol: method f()
    public void manipulate(){obj.f();}
}

class Manipulator3 {
    private HasF obj;
    public Manipulator3(HasF x) {obj = x;}
    public void manipulate(){obj.f();}
}

public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator2<HasF> manipulator = new Manipulator2<>(hf);
        manipulator.manipulate();
    }
}
// 这个类和上面那些类的区别在于,在这里没有调用类的方法,所以不需要在编译器了解到底是哪个类型
class ReturnGenericType<T extends HasF> {
    private T obj;
    public ReturnGenericType(T x) { obj = x; }
    public T get(){return obj;}
}
