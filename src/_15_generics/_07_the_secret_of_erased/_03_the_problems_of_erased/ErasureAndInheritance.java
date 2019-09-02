package _15_generics._07_the_secret_of_erased._03_the_problems_of_erased;

/**
 * @Author wx-li
 * @Date 2019/9/2 17:36
 **/
class GenericBase<T> {
    private T element;
    public void set(T arg){ arg = element; }
    public T get() { return element; }
}

class Derived1<T> extends GenericBase<T> {}
class Derived2 extends GenericBase{}  // No warning
// class Dervied3 extends GenericBase<?>{}

// some interesting case:
// class Derived3<T> extends GenericBase{}
// class Derived4 extends GenericBase<T>{} //! can not resolve symbol T

public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj); // Warning here!
    }
}
