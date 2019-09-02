package _15_generics._08_the_compensate_of_erased;
/**
 * @Author wx-li
 * @Date 2019/9/2 19:21
 **/
class Building{}
class House extends Building{}

public class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 =
            new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building())); //true
        System.out.println(ctt1.f(new House()));    //true
        ClassTypeCapture<House> ctt2 =
            new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building())); //false
        System.out.println(ctt2.f(new House()));    //true
    }
}
