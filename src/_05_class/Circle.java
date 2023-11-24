package _05_class;

public class Circle {
  private static final double PI = Math.PI;
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.pow(this.radius, 2) * Circle.PI;
  }
}
