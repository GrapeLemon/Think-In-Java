package _15_generics._09_border;
import java.awt.*;

/**
 * @Author wx-li
 * @Date 2019/9/3 10:17
 **/
interface HasColor { Color getColor();}

class Colored<T extends HasColor> {
    T item;
    Colored(T item){ this.item = item; }
    T getItem() { return item; }
    // The bound allows you to call a method:
    Color color(){ return item.getColor(); }
}

class Dimension{ public int x, y, z; }
//This won't work -- class must be first, then interfaces:
//class ColoredDimension<T extends HasColor & Dimension>{}

//Multiple bounds:
class ColoredDimension<T extends Dimension & HasColor> {
    T item;
    public ColoredDimension(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    Color color() { return item.getColor();}
    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }
}

interface Weight{ int weight(); }

//As with inheritance, you can have only one
//concrete class but multiple interfaces:
class Solid<T extends Dimension & HasColor & Weight> {
    T item;
    public Solid(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    Color color() { return item.getColor();}
    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }
    int weight() { return item.weight();}
}

class Bounded
    extends Dimension implements HasColor, Weight {
    @Override
    public Color getColor() {
        return null;
    }
    @Override
    public int weight() {
        return 0;
    }
}

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.getX();
        solid.weight();
    }
}
