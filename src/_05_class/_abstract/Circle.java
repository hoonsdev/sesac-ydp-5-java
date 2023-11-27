package _05_class._abstract;

public class Circle extends Shape {
  double radius;

  public Circle(String color, String type, double radius) {
    super(color, type);
    this.radius = radius;
  }

  // 추상 메소드 구현
  void draw() {
    System.out.println("원을 그리는 중입니다...");
  }

  double calculateArea() {
    return Math.pow(this.radius, 2) * Math.PI;
  }
}
