package _05_class._abstract;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {
  public static void main(String[] args) {
//    Circle circle = new Circle("blue", "circle", 5);
//    Square square = new Square("yellow", "square", 5, 8);
//
//    circle.start();
//    circle.draw();
//    System.out.println("원의 색상은 :: " + circle.getColor());
//    System.out.println("원의 넓이 :: " + circle.calculateArea());
//
//    square.start();
//    square.draw();
//    System.out.println("사각형의 색상은 :: " + square.getColor());
//    System.out.println("사각형의 넓이 :: " + square.calculateArea());
    Circle c = new Circle("red", "circle", 3);
    Square s = new Square("blue", "square", 3, 5);

    List<Shape> shapes = new ArrayList<>();
    shapes.add(c);
    shapes.add(s);
    for (Shape shape : shapes) {
      System.out.printf("=== %s 도형의 정보 ===\n", shape.getType());
      System.out.println("도형의 색상 : " + shape.getColor());
      System.out.println("도형의 넓이 : " + shape.calculateArea());
    }
  }
}
