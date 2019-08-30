package _14_type_info._01_why_need_RTTI;

import _05_initAndclean.pratice.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author wx-li
 * @Date 2019/8/30 15:27
 **/

abstract class Shape {
    void draw() {
       System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
            new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}
