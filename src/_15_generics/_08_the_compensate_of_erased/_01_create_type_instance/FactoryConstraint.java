package _15_generics._08_the_compensate_of_erased._01_create_type_instance;

import _14_type_info._04_register_factorymethod.Factory;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author wx-li
 * @Date 2019/9/2 19:46
 **/
interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<>(new Widget.Factory());
    }
}
