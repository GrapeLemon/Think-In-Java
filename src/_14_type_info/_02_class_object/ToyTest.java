package _14_type_info._02_class_object;

/**
 * @Author wx-li
 * @Date 2019/8/30 17:23
 * Testing class Class
 **/

interface HashBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy {
    //Comment out the following default constructor
    //to see NoSuchMethodError from (*1*)
    Toy() {}
    Toy(int i){}
}

class FancyToy extends Toy implements HashBatteries, Waterproof, Shoots{
    FancyToy() {super(1); }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("_14_type_info._02_class_object.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            //you can access outside the class such as private constructor
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

