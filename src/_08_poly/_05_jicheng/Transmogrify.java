package _08_poly._05_jicheng;

import _05_initAndclean.pratice.A;
import com.sun.xml.internal.bind.marshaller.SAX2DOMEx;

/**
 * @Author wx-li
 * @Date 2019/8/27 9:29
 * Dynamically changing the behavior of an object via composition(the "State" design pattern)
 **/

class Actor {
    public void act() {

    }
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
