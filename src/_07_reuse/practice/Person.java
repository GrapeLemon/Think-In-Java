package _07_reuse.practice;

/**
 * @Author wx-li
 * @Date 2019/8/26 15:13
 **/
public class Person {
    void run(){}
    void run(int i){}
    void run(float f){}
}

class Man extends Person{
    void run(String s){}

    public static void main(String[] args) {
        Man m = new Man();
        m.run();
        m.run(1);
        m.run(1.0f);
        m.run("nihao");
    }
}
