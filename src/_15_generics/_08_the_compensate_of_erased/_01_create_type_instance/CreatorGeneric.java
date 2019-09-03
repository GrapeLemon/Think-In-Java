package _15_generics._08_the_compensate_of_erased._01_create_type_instance;
/**
 * @Author wx-li
 * @Date 2019/9/3 9:12
 **/
abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate() { element = create(); }
    abstract T create();
}

class X{}

class Creator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }
    void f() {
        System.out.println((element.getClass().getSimpleName()));
    }
}
public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
