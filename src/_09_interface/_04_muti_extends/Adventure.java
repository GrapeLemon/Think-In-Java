package _09_interface._04_muti_extends;

/**
 * @Author wx-li
 * @Date 2019/8/27 13:33
 * Multipie interfaces.
 **/

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {

    }
}

class Hero extends ActionCharacter
    implements CanFight, CanSwim, CanFly{

    //为什么不用实现CanFight的方法？这就是通过继承复用了代码的最佳体现了..

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}


public class Adventure {
    public static void t(CanFight x){x.fight();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFly x){x.fly();}
    public static void w(ActionCharacter x){x.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);   //Treat it as a CanFight
        u(h);   //Treat it as a CanSwim
        v(h);   //Treat it as a CanFly
        w(h);   //Treat it as an ActionCharacter
    }
}
