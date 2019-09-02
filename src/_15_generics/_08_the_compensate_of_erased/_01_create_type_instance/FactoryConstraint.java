package _15_generics._08_the_compensate_of_erased._01_create_type_instance;

import _14_type_info._04_register_factorymethod.Factory;

/**
 * @Author wx-li
 * @Date 2019/9/2 19:46
 **/
interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2() {
        
    }
}

public class FactoryConstraint {
}
