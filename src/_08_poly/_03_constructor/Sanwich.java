package _08_poly._03_constructor;

/**
 * @Author wx-li
 * @Date 2019/8/26 17:38
 * Order of constructor calls.
 **/

class Meal {
    static String staticField = init();
    static String init() {
        System.out.println(" Meal.init()");
        return "123";
    }

    Meal(){
        System.out.println("Meal()");
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    public Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    public Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    static String staticField = init();
    static String init() {
        System.out.println(" Lunch.init()");
        return "123";
    }
    public Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    static String staticField = init();
    static String init() {
        System.out.println(" PortableLunch.init()");
        return "123";
    }
    public PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sanwich extends PortableLunch{
    static String staticField = init();

    static String init() {
        System.out.println(" Sanwich.init()");
        return "123";
    }
    private Bread b = new Bread();
    private Cheese c = new Cheese();

    private Lettuce l = new Lettuce();

    public Sanwich() {
        System.out.println("Sanwich()");
    }


    public static void main(String[] args) {
        new Sanwich();
    }
}
