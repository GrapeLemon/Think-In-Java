package _05_initAndclean;

/**
 * @author lwx
 * @date 2019/8/25-23:27
 * Demonstrates initialization order
 */


class Window{
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House{
    Window w1 = new Window(1);  //Before constructor

    House() {
        //show that we are in the constructor
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);  //After constructor

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);  //At end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        //一步步走会发现，自动初始化的时间点是在调用某个类的构造方法前才会触发，这也是合理的，构造函数触发了表明你需要使用这个对象，才给你初始化
        House h = new House();
        h.f();
    }
}
