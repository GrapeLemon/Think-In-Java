package _08_poly._03_constructor;

/**
 * @Author wx-li
 * @Date 2019/8/26 18:29
 * Constructors and polymorphism
 * don't produce what you might expect.
 **/

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() before draw()");
        //如果可以的话，避免在构造器中调用其他方法，因为这很有可能会出现这个示例代码所显示的那样。
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
