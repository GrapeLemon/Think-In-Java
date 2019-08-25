package _05_initAndclean._4_this;

/**
 * @author lwx
 * @date 2019/8/23-21:36
 */
class Person{

    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple) {
        //... remove peel
        return apple;   //Peeled
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}



public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
